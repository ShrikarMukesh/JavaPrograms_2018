package example;

import java.util.Scanner;

public class NumberOfDigits {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("enter a number");
	   int a=scanner.nextInt();
	   int result=1;
	   int q=a/10;
	   while(q !=0) {
		   q=q/10;
		   result++;
	   }
	   System.out.println(result);
	   scanner.close();
  }
}
