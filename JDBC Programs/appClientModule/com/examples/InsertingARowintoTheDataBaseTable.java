package com.examples;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingARowintoTheDataBaseTable {

	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@//192.168.1.63:1521/XE";
		String userid="SYSTEM";
		String passwd="root";
		Connection con=null;		
		PreparedStatement pstmt=null;
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
		try {
			pstmt=con.prepareStatement("INSERT INTO VTUSTUDENT VALUES(?,?,?,?,?,?)");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the Firstname");
			String a=scan.next();
			System.out.println("enter the Second Name");
			String b=scan.next();
			System.out.println("enter the Marks1");
			int c=scan.nextInt();
			System.out.println("enter the Marks2");
			int d=scan.nextInt();
			System.out.println("enter the Marks3");
			int e=scan.nextInt();
			System.out.println("enter avg");
			float f= scan.nextFloat();
		    pstmt.setString(1, a);
		    pstmt.setString(2, b);
		    pstmt.setInt(3, c);
		    pstmt.setInt(4, d);
		    pstmt.setInt(5, e);
		    pstmt.setFloat(6, f);
		    pstmt.executeUpdate();
		    System.out.println("query executed successfully");
		    
		}catch(SQLException x) {
			System.out.println("Query not executed");
		}
	}

}
