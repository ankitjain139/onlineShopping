package com.jainshopping.db.dao;

import java.sql.Connection;
import java.sql.Statement;
import com.jainshopping.db.MySqlConnection;
import com.jainshopping.servlet.SignupServlet;

public class SignupDAO {
	
	Connection con=null;
	MySqlConnection mysql = new MySqlConnection();
	SignupServlet ser = new SignupServlet();
	String userName;
	String password;
	String firstName;
	String lastName;
	String contact;
	
	try {
	Connection con = mysql.getConnection();
	Statement s = con.createStatement();
	
	String sql= "INSERT INTO USER_LOGIN (USERID,PASSWORD,FIRST_NAME,LAST_NAME,CONTACT) VALUES ('"+userName+"','"+password+"','"+firstName+"','"+lastName+"','"+contact+"')";
	s.execute(sql);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	

}


