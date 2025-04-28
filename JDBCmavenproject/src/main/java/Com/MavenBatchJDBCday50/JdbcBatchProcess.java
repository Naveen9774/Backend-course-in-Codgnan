package Com.MavenBatchJDBCday50;

import java.sql.*;
import java.util.Scanner;

public class JdbcBatchProcess {
	private static Connection con;
	private static PreparedStatement pstmt;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(ConnectionValues.url1,ConnectionValues.user1,ConnectionValues.pwd1);
		Scanner sc = new Scanner(System.in);
		String sql = "insert into student(name,college,phone,email) values (?,?,?,?)";
		System.out.println("Enter the count of student whose data has to be added: ");
		int count = sc.nextInt();
		int i = 1;
		con.setAutoCommit(false);
		while(i<=count) {
			pstmt = con.prepareStatement(sql);
			System.out.println("Enter the name: ");
			pstmt.setString(1, sc.next());
			System.out.println("Enter the college: ");
			pstmt.setString(2, sc.next());
			System.out.println("Enter the phone: ");
			pstmt.setString(3, sc.next());
			System.out.println("Enter the email: ");
			pstmt.setString(4, sc.next());
			
			pstmt.addBatch();
			
			i++;
			System.out.println("student added to batch ");
			System.out.println("--------------------------------------");
			
		}
		int[] executeBatch = pstmt.executeBatch();
		con.commit();
		System.out.println("Query is executed");
		for(int j : executeBatch) {
			System.out.println(j);
		}
		
		
	}

}

