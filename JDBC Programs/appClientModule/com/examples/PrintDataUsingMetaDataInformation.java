package com.examples;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import com.examples.ConnectionProgram;

public class PrintDataUsingMetaDataInformation {

	public static void main(String[] args) {       
		Statement stmt=null;
		ResultSet res=null;
		try {		    
			String s="SELECT * FROM VTUSTUDENT";
			stmt =ConnectionProgram.getConnection().createStatement();
			 res=stmt.executeQuery(s);
			System.out.println("query executed successfully");		
			
		}catch(SQLException x){
			System.out.println("query not executed successfully");
		}
		try {
			ResultSetMetaData rsmd=res.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++){
				System.out.println(rsmd.getColumnTypeName(i)+" "+rsmd.getColumnName(i));
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
