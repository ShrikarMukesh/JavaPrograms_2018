package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingColumnNameToPrintData {

	public static void main(String[] args) {

		String url="jdbc:oracle:thin:@//192.168.1.63:1521/XE";
		String userid="SYSTEM";
		String passwd="root";
		Connection con=null;
		Statement stmt=null;
		ResultSet res=null;
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
			String s="SELECT * FROM VTUSTUDENT";
			stmt =con.createStatement();
			res=stmt.executeQuery(s);
			System.out.println("query executed successfully");		
			
		}catch(SQLException x){
			System.out.println("query not executed successfully");
		}
		try {
			while(res.next()==true) {
			String a=res.getString("S_FIRSTNAME");
			String b=res.getString("S_LASTNAME");
			int	c=res.getInt("MARKS1");
			int	d=res.getInt("MARKS2");
			int e=res.getInt("MARKS3");
			float f=res.getFloat("AVARAGE");
				System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
			}
		}catch(SQLException x)
		{
			System.out.println("unable to access the data ");
		}
		
	}

}
