package com.onmobile.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionManager {
	
	private String url = "jdbc:mysql://localhost:3306/training";
	private String driver = "com.mysql.jdbc.Driver";
	private String user = "root";
	private String pass = "onmobile";
	private String query = null;
	
	Connection  con = null;
	
	private static ConnectionManager cm =null;
	
	private ConnectionManager () {
		
		
		
	}
	
	public static ConnectionManager getInstance() {
		
		if (cm == null) {
			cm =  new ConnectionManager();
		}
		
		return cm;
	}
	
	public  Connection getConnection() {
		
		System.out.println("Getting connection from DB");
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			return con;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public  void releaseConnection(Connection con){
		
		System.out.println("relesing connection");
		try {
			if(con!=null) {
				con.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
