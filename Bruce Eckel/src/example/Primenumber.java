package example;

import java.util.Scanner;

class Primenumber 
{
	public static void main(String[] args) 
	{
	   int number, i;// fect=1;
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter any number :");
	  number =s.nextInt();
	  if(number==1)
	  {
	    System.out.println("Smallest Prime number is 2");
	  }
	  for(i=2;i<number;i++)
	  {
	     if(number%i==0)
	     {
	         System.out.println("Not Prime");
	         break;
	     }
	 }
	 if(number==i)
	 {
	     System.out.println("Prime");
	 }s.close();
	}
}
