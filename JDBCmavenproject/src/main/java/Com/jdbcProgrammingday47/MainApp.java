package Com.jdbcProgrammingday47;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
	private static Connection con;
	private static Statement stmt;
	private static ResultSet res;
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		  //Step:1  =Load The Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		  //Step:2 = Establish Connection
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/janJDBC","root","roor123");
	        System.out.println("Connected to DB");
	        
	      //Step:3 = Create SQL Query
	        String sql="select * from student";
	        stmt=con.createStatement();
	      //Step:4 = Convert the string based query to SQL based query
	        res=stmt.executeQuery(sql);
	     
	      //Step:5 = Execute Query and collect the result
	        while(res.next()==true) {
				System.out.println(res.getInt(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getString(4));
				System.out.println(res.getString(5));
				System.out.println(res.getLong(6));
				System.out.println(res.getString(7));
				System.out.println("==============");
				
			}
			res.close();
			stmt.close();
			con.close();

			
		}

}
