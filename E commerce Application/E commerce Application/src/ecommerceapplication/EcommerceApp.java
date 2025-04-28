package ecommerceapplication;

import java.sql.*;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.*;

// Main Application Class
public class EcommerceApp {

    private static final Logger logger = Logger.getLogger(EcommerceApp.class.getName());

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        EcommerceService ecommerceService = new EcommerceService();
        ecommerceService.showMainMenu(scanner);
    }

    // Singleton for Database Connection
    static class DatabaseConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/ecommerce";
        private static final String USER = "root";
        private static final String PASSWORD = "roor123";

        private static Connection connection;

        private DatabaseConnection() {}

        public static Connection getConnection() throws SQLException {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            return connection;
        }
    }

    // Mobiles class
    static class Mobiles {
        int id;
        String name;
        double price;
        String description;
        int stock;

        public Mobiles(int id, String name, double price, String description, int stock) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.description = description;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return String.format("ID: %d | %s | Price: %.2f | Stock: %d | Description: %s", id, name, price, stock, description);
        }
    }

    // Factory for Mobiles
    static class ProductFactory {
        public static Mobiles createMobile(int id, String name, double price, String description, int stock) {
            return new Mobiles(id, name, price, description, stock);
        }
    }

    // DAO Class for Database Operations
    static class MobilesDAO {
        private static final String GET_ALL_MOBILES_QUERY = "SELECT * FROM mobiles";

        public static CompletableFuture<List<Mobiles>> fetchAllMobiles() {
            return CompletableFuture.supplyAsync(() -> {
                List<Mobiles> mobilesList = new ArrayList<>();
                try (Connection connection = DatabaseConnection.getConnection();
                     Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(GET_ALL_MOBILES_QUERY)) {

                    while (resultSet.next()) {
                        Mobiles mobile = ProductFactory.createMobile(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getDouble("price"),
                                resultSet.getString("description"),
                                resultSet.getInt("stock")
                        );
                        mobilesList.add(mobile);
                    }
                } catch (SQLException e) {
                    logger.log(Level.SEVERE, "Error fetching all mobiles", e);
                }
                return mobilesList;
            });
        }

        public static CompletableFuture<Mobiles> fetchMobileById(int id) {
            return CompletableFuture.supplyAsync(() -> {
                String query = "SELECT * FROM mobiles WHERE id = ?";
                Mobiles mobile = null;
                try (Connection connection = DatabaseConnection.getConnection();
                     PreparedStatement statement = connection.prepareStatement(query)) {

                    statement.setInt(1, id);
                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            mobile = ProductFactory.createMobile(
                                    resultSet.getInt("id"),
                                    resultSet.getString("name"),
                                    resultSet.getDouble("price"),
                                    resultSet.getString("description"),
                                    resultSet.getInt("stock")
                            );
                        }
                    }
                } catch (SQLException e) {
                    logger.log(Level.SEVERE, "Error fetching mobile by ID", e);
                }
                return mobile;
            });
        }
    }

    // Cart Class
    static class Cart {
        private final List<Mobiles> mobilesInCart = new ArrayList<>();
        private final Map<Mobiles, Integer> quantityMap = new HashMap<>();

        public void addMobile(Mobiles mobile, int quantity) {
            if (quantityMap.containsKey(mobile)) {
                quantityMap.put(mobile, quantityMap.get(mobile) + quantity);
            } else {
                mobilesInCart.add(mobile);
                quantityMap.put(mobile, quantity);
            }
        }

        public List<Mobiles> getMobilesInCart() {
            return mobilesInCart;
        }

        public double getTotalAmount() {
            double total = 0;
            for (Mobiles mobile : mobilesInCart) {
                total += mobile.price * quantityMap.get(mobile);
            }
            return total;
        }

        public void removeMobile(Mobiles mobile) {
            quantityMap.remove(mobile);
            mobilesInCart.remove(mobile);
        }

        public void displayCart() {
            System.out.println("\nYour Cart:");
            for (Mobiles mobile : mobilesInCart) {
                System.out.printf("%s | Quantity: %d | Price: %.2f\n", mobile.name, quantityMap.get(mobile), mobile.price);
            }
            System.out.printf("\nTotal Amount: %.2f\n", getTotalAmount());
        }

        public Map<Mobiles, Integer> getQuantityMap() {
            return quantityMap;
        }
    }

    // Service Layer for business logic
    static class EcommerceService {

        public void showMainMenu(Scanner scanner) throws InterruptedException, ExecutionException {
            Cart cart = new Cart();

            // Fetch all mobiles asynchronously
            CompletableFuture<List<Mobiles>> mobileListFuture = MobilesDAO.fetchAllMobiles();
            List<Mobiles> mobiles = mobileListFuture.get(); // This blocks, but in real-world we would handle this more gracefully

            displayMobiles(mobiles);

            while (true) {
                System.out.println("\nEnter the Mobile ID to add to cart (or 0 to checkout): ");
                int mobileId = scanner.nextInt();

                if (mobileId == 0) {
                    checkout(cart);
                    break;
                }

                // Fetch mobile details asynchronously
                CompletableFuture<Mobiles> mobileFuture = MobilesDAO.fetchMobileById(mobileId);
                Mobiles selectedMobile = mobileFuture.get();

                if (selectedMobile != null) {
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addMobile(selectedMobile, quantity);
                    System.out.println("Added " + quantity + " of " + selectedMobile.name + " to your cart.");
                } else {
                    System.out.println("Invalid Mobile ID. Please try again.");
                }

                cart.displayCart();
            }
        }

        public void checkout(Cart cart) {
            System.out.println("\nProceeding to Checkout...");
            cart.displayCart();
            if (confirmPayment()) {
                generateBill(cart);
                System.out.println("\nThank you for your purchase!");
            } else {
                System.out.println("Payment not confirmed. Returning to the main menu.");
            }
        }

        private boolean confirmPayment() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nDo you want to proceed with the payment? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            return response.equals("yes");
        }

        public void generateBill(Cart cart) {
            System.out.println("\u001B[31m\n-------- BILL --------\u001B[0m");
            double totalAmount = cart.getTotalAmount();
            cart.getMobilesInCart().forEach(mobile -> 
                System.out.printf("\u001B[37m%s | Price: %.2f | Quantity: %d\n", mobile.name, mobile.price, cart.getQuantityMap().get(mobile))
            );
            System.out.printf("Total Amount: %.2f\n", totalAmount);
        }

        private void displayMobiles(List<Mobiles> mobiles) {
            System.out.println("Available Mobiles:");
            mobiles.forEach(mobile -> 
                System.out.printf("%d. %s | Price: %.2f | Stock: %d\n", mobile.id, mobile.name, mobile.price, mobile.stock)
            );
        }
    }
}
