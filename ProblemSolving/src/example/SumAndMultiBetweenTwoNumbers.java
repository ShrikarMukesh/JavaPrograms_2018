package example;

import java.util.Scanner;

class SumAndMultiBetweenTwoNumbers {
    public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		int array[]=new int[5];
		System.out.println("Enter the the numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int i=0;
		if(b<a) {
			System.out.println("please enter First number is less than second number");
			main(args);
		}
		int j=0;
		for(i=a;i<b;i++) {
             array[j]=i;
             j++;
		}
		for(i=0;i<array.length;i++) {
		   System.out.println(array[i]);
		}
		int sum=0;
		for(i=0;i<array.length;i++) {
		    if(array[i]>a) {
	     	  sum=array[i]+sum;
		      i++;
		    }
		}
		System.out.println(sum);
		scanner.close();*/
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the the numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int sum=0,mul=1;
		if(a<b) {
			for(int i=a+1;i<b;i++) {
				sum=sum+i;
				mul=mul*i;
			}
			System.out.println("sum ="+sum);
			System.out.println("mul ="+mul);
		}scanner.close();
	}
}
