package ecommerceapplication;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getConnection() {
		try {
			// Use your MySQL database details here
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "roor123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}