package com.banking.controller;

import java.io.IOException;

import com.banking.Model.Model;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cid = req.getParameter("cid");
		String pwd = req.getParameter("pwd");
		
		
		Model m = new Model();
		int accno = m.login(cid,pwd);
		if(accno == 0) {
			resp.sendRedirect("/BankingProject/LoginFail.html");
			
		}
		else {
			resp.sendRedirect("/BankingProject/Home.html");
		}
	
	
	}
}
