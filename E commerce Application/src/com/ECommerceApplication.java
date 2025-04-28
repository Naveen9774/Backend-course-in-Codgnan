package com;

import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + ". " + name + " - rs" + price;
    }
}

public class ECommerceApplication {
    private static final List<Product> products = new ArrayList<>();
    private static final List<Product> cart = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeProducts();
        shoppingMenu();
    }

    private static void initializeProducts() {
        products.add(new Product(1, "Laptop", 1200.00));
        products.add(new Product(2, "Smartphone", 800.00));
        products.add(new Product(3, "Headphones", 150.00));
    }

    private static void shoppingMenu() {
        while (true) {
            System.out.println("\n1. View Products\n2. Add to Cart\n3. View Cart\n4. Checkout\n5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: viewProducts(); break;
                case 2: addToCart(); break;
                case 3: viewCart(); break;
                case 4: checkout(); break;
                case 5: 
                    System.out.println("Thank you for shopping!");
                    return;
                default: System.out.println("Invalid choice, try again.");
            }
        }
    }

    private static void viewProducts() {
        System.out.println("\nAvailable Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void addToCart() {
        System.out.print("Enter product ID to add to cart: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        for (Product product : products) {
            if (product.getId() == productId) {
                cart.add(product);
                System.out.println("Added to cart: " + product.getName());
                return;
            }
        }
        System.out.println("Invalid product ID.");
    }

    private static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("\nYour Cart:");
        for (Product product : cart) {
            System.out.println(product);
        }
    }

    private static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        double total = cart.stream().mapToDouble(Product::getPrice).sum();
        System.out.println("Total amount: rs" + total);
        System.out.println("Checkout complete. Thank you for shopping!");
        cart.clear();
    }
}
