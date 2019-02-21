package com.exmaple1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletingRowFromtheDatabaseTable {

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
			pstmt=con.prepareStatement("DELETE FROM VTUSTUDENT WHERE S_FIRSTNAME = ?");
			@SuppressWarnings("resource")
			Scanner scan= new Scanner(System.in);
			System.out.println("enter first name");
			String temp=scan.next();
			pstmt.setString(1,temp);
			pstmt.executeUpdate();
			System.out.println("query executed sussfully");
		}catch(SQLException x) {
			System.out.println("query not executed");
		}
	}

}
