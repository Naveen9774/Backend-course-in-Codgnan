package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.utils.Constants;
import com.utils.Employee;



public class Model {
	private Connection con;
	private PreparedStatement pstmt;

	public Model() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(Constants.url,Constants.user,Constants.pwd);
			System.out.println("All the connections are established to the DB");

		}
		catch (Exception e){
			System.out.println("Database connectivity is failed");

		}

	}

	public boolean insertData(Employee e) {
		try {
			String sql = "insert into employee (ename,company,salary,email,phone,experience) values (?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, e.getEname());
			pstmt.setString(2, e.getCompany());
			pstmt.setInt(3, e.getSalary());
			pstmt.setString(4, e.getEmail());
			pstmt.setLong(5, e.getPhone());
			pstmt.setInt(6, e.getExperience());


			int x = pstmt.executeUpdate();
			if(x>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e1) {
			return false;

		}
	}

}



