package example;

import java.util.Scanner;

public class PrintPrimeNumbersWithAGivenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		   System.out.println("enter a number");
		   int a=scanner.nextInt();
		   boolean Isprime=true;
		   int count=0,large=0;
		   for(int i=1;i<a;i++) {
			   Isprime=true;
			   for(int j=2;j<i;j++) {
				   if(i%j==0) {
					   Isprime=false;
					   break;
				   }
			   }
			   if(Isprime && i!=2) {
				   count++;
				   large=i;
				   System.out.println(i);
				   Isprime=false;
			   }
		   }
		   System.out.println(count+"   "+large);
		   scanner.close();
	}   

}
