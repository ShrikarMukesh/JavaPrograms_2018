package com.examples;

import java.sql.DriverManager;
import oracle.jdbc.driver.OracleDriver;


public class LoadDriver {

	public static void main(String[] args) {
		try{
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("driver loaded sussessfully");
		}catch(Exception e)
		{
			System.out.println("driver not loaded");
		}
		/////
		System.out.println("second type");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded sussessfully");
		}catch(Exception e)
		{
			System.out.println("driver not loaded");
		}
		////
		System.out.println("third type");
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			System.out.println("driver loaded sussessfully");
		}catch(Exception e)
		{
			System.out.println("driver not loaded");
		}
	}

}
