package com.elevysi.javaee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {

	 private Connection connection;
	 
	 public DBConnectionManager(String dbURL, String username, String password) throws ClassNotFoundException, SQLException{
		 
		 try {
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             throw new SQLException(e);
         }
		 
		 this.connection = DriverManager.getConnection(dbURL, username, password);
	 }
	 
	 public Connection getConnection() {
		 return this.connection;
	 }
}
