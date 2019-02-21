package dataStructureExamples;

import java.util.Scanner;

class Practice {

	 public static Scanner value;
     public static void main(String[]args){
         value=new Scanner(System.in);
         System.out.println("Enter the number of tests to calculate average\n");
         int limit=value.nextInt();
         int index=0;
         int [] marks=new int[limit];
         float sum,ave;
         sum=0;      
         while(index<limit)
         {
             int test=index+1;
             System.out.println("Enter the marks on test " +test);
             marks[index]=value.nextInt();
             sum=sum+marks[index];
             index++;
         }
         ave=sum/limit;
         System.out.println("The average is: " + ave);
     }
}
