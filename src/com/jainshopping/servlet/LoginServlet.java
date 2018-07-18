package com.jainshopping.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;

import com.jainshopping.db.dao.LoginDAO;

public class LoginServlet extends HttpServlet{
	
	   @Override
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
	      // Set the response message's MIME type
	      response.setContentType("text/html;charset=UTF-8");
	      // Allocate a output writer to write the response message into the network socket
	      PrintWriter out = response.getWriter();
	      RequestDispatcher despatcher = null;
		// @formatter:on

	      
	      String userName=request.getParameter("userName");
	      String password=request.getParameter("password");
	      
	      LoginDAO loginDAO=new LoginDAO();
	      boolean isValidUser=loginDAO.verifyUser(userName, password);
	      
	      if(isValidUser)
	      {
	    	  despatcher = request.getRequestDispatcher("/dashboard.jsp");
	  		
	    	  despatcher.forward(request, response);  
	      }
	      else
	      {
	    	  despatcher = request.getRequestDispatcher("/loginPage.jsp");
		  		
		    	despatcher.forward(request, response); 
	      }
	      
	     
	      
	}
	

}
