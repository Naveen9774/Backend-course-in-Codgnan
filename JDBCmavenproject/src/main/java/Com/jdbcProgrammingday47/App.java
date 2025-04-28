package Com.jdbcProgrammingday47;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class App {
	private static java.sql.Statement stmt;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
           //Step:1  =Load The Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		    //Step:2 = Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/janJDBC","root","roor123");
		if(con==null)
		{
			System.out.println("Connection Failed");
		}
		else
		{
			System.out.println("Connectionn Sucessfull");
			//step:3 =Create Sql Query
//			String sql1="create table sample_maven_test(id int,name varchar(100))";
			String sql1="insert into sample_test1 values(1,'naveen')";
			// Step 4 =Convert the String based query to sql based query
			stmt=con.createStatement();
			//step 5: Execute Query and Collect The result

			int x=stmt.executeUpdate(sql1);
			if(x>=0)
			{
				System.out.println("table Created");
			}
			else
			{
				System.out.println("Table not created");
			}
			stmt.close();
			con.close();
		}
	}
}

