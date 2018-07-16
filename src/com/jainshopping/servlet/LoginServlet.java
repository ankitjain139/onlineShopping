package com.jainshopping.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jainshopping.db.MySqlConnection;

public class LoginServlet extends HttpServlet{
	
	@Override
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
	      // Set the response message's MIME type
	      response.setContentType("text/html;charset=UTF-8");
	      // Allocate a output writer to write the response message into the network socket
	      PrintWriter out = response.getWriter();
	      
	      String userId=request.getParameter("userId");
	      
	      MySqlConnection mySqlConnection=new MySqlConnection();
	      Connection con=mySqlConnection.getConnection();
	      
	      
	      
	      
	      response.sendRedirect("");

	      
	      
	}
	

}
