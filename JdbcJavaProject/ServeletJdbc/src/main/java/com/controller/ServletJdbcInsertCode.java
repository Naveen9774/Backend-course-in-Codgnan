package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.utils.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ServletJdbcInsertCode")
public class ServletJdbcInsertCode extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {
		Employee e = new Employee();
		e.setEname(req.getParameter("name"));
		e.setCompany(req.getParameter("comp"));
		e.setSalary(Integer.parseInt(req.getParameter("sal")));
		e.setSalary(Integer.parseInt(req.getParameter("exp")));
		e.setEmail(req.getParameter("email"));
		e.setPhone(Long.parseLong(req.getParameter("phn")));
		
		PrintWriter writer = resp.getWriter();
		
		Model m = new Model();
		boolean res = m.insertData(e);
		if(res==false) {
			resp.sendRedirect("/ServeletJdbc/InsertFail.html");
		}
		else {
			resp.sendRedirect("/ServeletJdbc/InsertSuccess.html");
		}
		
	}

}
