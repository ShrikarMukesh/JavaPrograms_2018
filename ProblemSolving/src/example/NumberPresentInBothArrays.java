/*Declare and take input from the user in two arrays a and b, 
 * you have to print all the numbers which exist in both the arrays
 */
package example;
import java.util.Scanner;
public class NumberPresentInBothArrays {

	public static void main(String[] args) {
	    
	   Scanner scanner= new Scanner(System.in);
       int []arr1=new int[4];
       int []arr2=new int[5];
       System.out.println("enter the elements into  first array");
       for(int i=0;i<arr1.length;i++) {
    	   arr1[i]=scanner.nextInt();
       }
       System.out.println("enter the elements into second array");
       for(int i=0;i<arr1.length;i++) {
    	   arr2[i]=scanner.nextInt();
       }
       for(int i=0;i<arr1.length;i++) {
    	   for(int j=0;j<arr2.length;j++) {
    		   if(arr1[i]==arr2[j]) {
    			   System.out.println("element present in both array="+arr1[i]);
    		   }
    	   }
       }
       scanner.close();
	}

}
