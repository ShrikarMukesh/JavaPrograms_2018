package example;

import java.util.Scanner;

public class ISPrime {

	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("enter a number");
	   int a=scanner.nextInt();
	   boolean Isprime=true;
	   for(int i=2;i<a/2;i++) {//note a number is divisible by should only half a/2 
		   if(a%i==0) {
			   Isprime=false;
			   break;
		   }
	   }
	   if(Isprime) {
		   System.out.println("yes");
	   }else {
		   System.out.println("no");
	   }
	   scanner.close();
	}
   
}
