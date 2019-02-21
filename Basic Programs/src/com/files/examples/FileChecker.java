package com.files.examples;
import java.io.File;
import java.io.IOException;

public class FileChecker {
	
	public static void main(String args[]) throws IOException {

		  File f = new File("D:\\mkyong.txt");
          if(f.createNewFile())
          {
        	  System.out.println("file is crated");
          }else {
        	  System.out.println("file already exist");
          }
		  if(f.exists()){
			  System.out.println("File existed");
		  }else{
			  System.out.println("File not found!");
		  }
		 // if(f.delete()==true)
		  {
			  System.out.println("file is deleted ");
		  }
          String string=f.getAbsolutePath();
          System.out.println(string);
          String string2=f.getCanonicalPath();
          System.out.println(string2);
          
          System.out.println(f.canWrite());
          System.out.println(f.length());
          System.out.println(f.canRead());
          System.out.println(f.setWritable(false));
	  }
}
