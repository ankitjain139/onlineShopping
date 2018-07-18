package com.jainshopping.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
   public Connection getConnection() {
	   Connection con =null;
	   try {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ankit");
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   return con;
   }
   
   public void closeConnection(Connection con) {
	   try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

}
