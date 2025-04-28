package com.banking.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.banking.controller.Login;
import com.banking.utils.Constants;
import com.banking.utils.Customer;




public class Model {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;

	public Model() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(Constants.url,Constants.user,Constants.pwd);

		}
		catch (Exception e){
			System.out.println("Database connectivity is failed");

		}

	}

	public boolean regiterCustomer(Customer c) {
		try {
			String sql = "insert into bank (cname,cust_id,email,phone,pwd,balance) values (?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, c.getCname());
			pstmt.setString(2, c.getCid());
			pstmt.setString(3, c.getEmail());
			pstmt.setLong(4, c.getPhone());
			pstmt.setString(5, c.getPwd());
			pstmt.setInt(6, c.getBal());


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




	public int login(String cid,String pwd) {
		try {
			String sql = "select accno from bank where cust_id=? and pwd=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cid);
			pstmt.setString(2, pwd);
			res = pstmt.executeQuery();
			int accno = 0;
			while(res.next()==true) {
				accno = res.getInt(1);
			}
			return accno;
		}
		catch (Exception e) {
			return 0;
		}
	}

	public int getBalance(int accno) {
		try {
			String sql = "select balance from bank where accno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, accno);
			res = pstmt.executeQuery();
			int bal = 0;
			while(res.next()==true) {
				bal = res.getInt(1);
			}
			return bal;
		}
		catch (Exception e) {
			return 0;
		}
	}
	
	public boolean changePwd(String npwd, int accno) {
		try {
			String sql = "update bank set pwd=? where accno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, npwd);
			pstmt.setInt(2, accno);
			int x = pstmt.executeUpdate();
			if(x>0) 
				 return true;
				else
				 return false;
					
		}catch(Exception e) {
			return false;
		}
	}
}



