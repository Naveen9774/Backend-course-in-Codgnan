package com.jdbcProgrammingday49;

import java.sql.*;
import java.util.Scanner;

public class MetaData1 {
	private static PreparedStatement pstmt;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(ConnectionValues.url,ConnectionValues.user,ConnectionValues.pwd);	
		
		String sql = "insert into student values(?,?,?,?,?,?,?)";
		//String sql1 = "update student set sname = ? where id = ?";
		//Step:4 = Convert the string based query to SQL based query
		PreparedStatement pstmt = con.prepareStatement(sql);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id : ");
		int id = sc.nextInt();
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("Enter the school : ");
		String school = sc.next();
		System.out.println("Enter the father name : ");
		String fname = sc.next();
		System.out.println("Enter the mother name : ");
		String mname = sc.next();
		System.out.println("Enter the phone number : ");
		long phone = sc.nextLong();
		System.out.println("Enter the email : ");
		String email = sc.next();
		
		pstmt.setInt(1,id);
		pstmt.setString(2,name);
		pstmt.setString(3,school);
		pstmt.setString(4,fname);
		pstmt.setString(5,mname);
		pstmt.setLong(6,phone);
		pstmt.setString(7,email);
		
		boolean execute = pstmt.execute();
		if(execute==true) {
			System.out.println("Data inserted");
		}
		else {
			System.out.println("Data not inserted");
		}
	}
}
	
 