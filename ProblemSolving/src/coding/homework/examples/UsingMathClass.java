package coding.homework.examples;

import java.util.Scanner;
public class UsingMathClass {
   public static void main(String[] args) {
	
	   Scanner scan =new Scanner(System.in);
	   int num1=0;
	   int num2=0;
	   double cube=0;
	   System.out.println("enter first number");
	   num1=scan.nextInt();
	   System.out.println("enter second number");
	   num2=scan.nextInt();
	   scan.close();
	   cube=Math.pow(num1, 3)+Math.pow(num2, 3);
	   System.out.println("sum of cube of two digits"+cube);
  }
}
