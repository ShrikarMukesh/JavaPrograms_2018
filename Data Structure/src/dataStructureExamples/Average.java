package dataStructureExamples;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number of tests");
		int tests=scan.nextInt();
		int start=0;
		int sum=0;
		int marks[]= new int[tests]; 
		while(start<tests)
		{
			int test=start+1;
			System.out.println("enter the marks of tests"+test);
			marks[start]=scan.nextInt();
			sum=sum+marks[start];
			start++;
		}
		float ave=sum/start;
		System.out.println("average of marks");
		System.out.println(ave);
		scan.close();
	}

}
