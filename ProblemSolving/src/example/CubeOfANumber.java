package example;

import java.util.Scanner;

public class CubeOfANumber {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Base :");
	   int base=scanner.nextInt();
	   System.out.println("exponent: ");
	   int expo=scanner.nextInt();
	   int result=1,i=1;
	   do{
		   result=result*base;
		   i++;
	   }while(i<=expo);
	   System.out.println(result);
	   scanner.close();
   }
}
