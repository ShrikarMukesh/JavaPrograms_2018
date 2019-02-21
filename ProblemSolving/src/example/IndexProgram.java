/*Declare an array and take input from the user in that array, 
 * ask the user to enter an integer and you have to print index number of that integer. 
 * if that number exists 2 or more time at different indexes then u have to print all 
 * indexes having that integer input
 */
package example;
import java.util.Scanner;
public class IndexProgram {
   public static void main(String[] args) {
	 Scanner scanner= new Scanner(System.in);
	 int [] arr=new int[10];
	 System.out.println("array values");
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=scanner.nextInt();
	 }
	 System.out.println("num a:");
	 int a=scanner.nextInt();
	 System.out.println("num b:");
	 int b=scanner.nextInt();
	 int a_index=0,b_index=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]==a) {
			 a_index=i;
		 }
		 if(arr[i]==b) {
			 b_index=i;
		 }
	 }
	 System.out.println("the index of a= "+a_index+ " the indexof b="+b_index);
	 
	 int c=arr[a_index];
	 arr[a_index]=arr[b_index];
	 arr[b_index]=c;
	 for(int i=0;i<arr.length;i++) {
		 System.out.println(arr[i]+" ");
	 }
	 scanner.close();
   }
}