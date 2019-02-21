package patterns;

import java.util.Scanner;
public class Practice
{
	public static void main(String[] args){
	   int n,fib=0,fib1=1,fib2 = 0;
	   Scanner scanner= new Scanner(System.in);
	   System.out.println("print n ");
	   n=scanner.nextInt();
	   if(n==1) {
		   System.out.println(fib);
	   }
	   else if(n==2) {
		   System.out.println(fib+" "+fib1);
	   }
	   else {
		   System.out.println(fib+" "+fib1);
		   for(int i=3;i<=n;i++) {
			   fib2=fib+fib1;
			   System.out.println(fib2);
			   fib=fib1;
			   fib1=fib2;
		   }
	   }scanner.close();
	   
	}
	
}
