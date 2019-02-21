package com.examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectingSpecificRowFromtheDataBaseTable {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@//192.168.1.63:1521/XE";
		String userid="SYSTEM";
		String passwd="root";
		Connection con=null;		
		ResultSet res=null;
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
		try{
			pstmt=con.prepareStatement("SELECT * FROM VTUSTUDENT WHERE S_FIRSTNAME=?");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("enter first name");
			String temp=scan.next();
			pstmt.setString(1,temp);
			res=pstmt.executeQuery();
			System.out.println("query executed successfully");
		}
		catch(SQLException x) {
			System.out.println("query no executed");
		}
		try {
			ResultSetMetaData rsmd=res.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();++i){
				
				System.out.println(rsmd.getColumnName(i));
				System.out.println(rsmd.getColumnTypeName(i));
			}
		}catch(Exception e){
			System.out.println("no matadata found");
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
			System.out.println("unable to print the data ");
		}
	}

}
