package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingcolumnNumberPrintTheData {

	public static void main(String[] args) {
		
		String url="jdbc:oracle:thin:@//192.168.1.63:1521/XE";
		String userid="SYSTEM";
		String passwd="root";
		Connection con=null;
		Statement stmt=null;
		ResultSet res=null;
		String a=null;
		String b=null;
		int c=0;
		int d=0; 
		int e=0;
		float f= 0.0f;
		
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
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT * FROM VTUSTUDENT");
			System.out.println("query executed sucessfully");
			
		}catch(SQLException x){
			System.out.println("query not executed successfully");
		}
		try {
			while(res.next()==true) {
				a=res.getString(1);
				b=res.getString(2);
				c=res.getInt(3);
				d=res.getInt(4);
				e=res.getInt(5);
				f=res.getFloat(6);
				System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
			}
		}catch(SQLException x)
		{
			System.out.println("unable to access the data ");
		}
	}

}
