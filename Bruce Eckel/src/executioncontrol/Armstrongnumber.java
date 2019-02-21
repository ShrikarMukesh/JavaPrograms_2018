package executioncontrol;

import java.util.Scanner;

class Armstrongnumber
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.println("enter the armstrong number");
		int InputNumber=scan.nextInt();
		convertInt2Array(InputNumber);
	}
	public static void convertInt2Array(int guess)
	{
		String temp = Integer.toString(guess);
		int newGuess[] = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		}
		
		int a=newGuess[0]*newGuess[0]*newGuess[0];
		int b=newGuess[1]*newGuess[1]*newGuess[1];
		int c=newGuess[2]*newGuess[2]*newGuess[2];
		int d=a+b+c;
		
		if(guess !=d)
		{
			System.out.println("its not a armstrong number");
		}
		else
		{
			System.out.println("the given number is armstrong number");
		}
	            
	}
}
