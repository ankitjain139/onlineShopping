package com.jainshopping.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jainshopping.db.MySqlConnection;

public class LoginDAO {

	Connection con=null;
	public boolean verifyUser(String userName,String password) {
		MySqlConnection mysql = new MySqlConnection();
		
	    int count=0;

		try {
		con =	mysql.getConnection();
		Statement s = con.createStatement();
		String sql = "select count(*) from USER_LOGIN where userid='"+userName+ "' and password = '"+password+ "'";
	    ResultSet rs = s.executeQuery(sql);
	    rs.next();
	    count=rs.getInt(1);
	    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	    if(count>0)
	    	return true;
	    else
	    	return false;
		
	    
	    
	}
	
	
	
	
}

