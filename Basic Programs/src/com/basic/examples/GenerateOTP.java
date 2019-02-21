package com.basic.examples;

import java.util.Random;
import java.util.Scanner;

class GenerateOTP {
   public static void main(String[] args) {
	  click();
   }
   public static void click() {
	   
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("enter 1 to generate OTP");
       int choice=scanner.nextInt();
	   switch(choice){
	    case 1:GenerateOTP.generate();
	   
	   }scanner.close();  
   }
   public static void generate() {
	   Random r = new Random();
	   for(int i=0;i<10;i++) {
	      System.out.println(r.nextInt(9999));
	   }
   }
}
