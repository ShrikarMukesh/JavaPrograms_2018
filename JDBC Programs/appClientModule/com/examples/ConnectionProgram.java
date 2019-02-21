package com.examples;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProgram {
	static Connection con=null;
	public static void main(String[] args) {
		new ConnectionProgram();
		getConnection();
	}
	public static Connection getConnection()
	{
		String url="jdbc:oracle:thin:@//192.168.1.58:1521/XE";
		String userid="SYSTEM";
		String passwd="root";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded sussessfully");
		}catch(ClassNotFoundException x){
			System.out.println("driver not loaded");
		}
		try {
		     con = DriverManager.getConnection(url, userid, passwd);
		     System.out.println("connection established sucessfully");
	    }catch(Exception x){
	     	System.out.println("connection not established");
    	}
		return con;
	}	
} 
