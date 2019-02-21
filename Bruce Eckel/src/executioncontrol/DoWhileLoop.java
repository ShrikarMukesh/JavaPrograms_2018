package executioncontrol;

import java.util.Scanner;

class DoWhileLoop 
{
	static int j;
	static Scanner scan = new Scanner(System.in);
  	public static void main(String[] args)
	{
		do
		{ 
			System.out.println("enter a number ");
			
		    int num=scan.nextInt();
		    System.out.println(num);
		    System.out.println("do u want to continue");
            j=scan.nextInt();
            
		}while(j==1);
		   scan.close();
	}
}
