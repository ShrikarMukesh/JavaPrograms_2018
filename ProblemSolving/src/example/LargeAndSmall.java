package example;
import java.util.Scanner;
class LargeAndSmall {
   public static void main(String[] args) {
	  @SuppressWarnings("resource")
	Scanner scanner= new Scanner(System.in);
	  int i=2,small=0,large=0;
	  System.out.print("num : ");
	  int a=scanner.nextInt();
	  small=a;
	  large=a;
	 while(i<=10) {
		 
		 System.out.print("num :"+i+ ":");
		 int b=scanner.nextInt();
		 if(b<small) {
			 small=b;
		 }
		 if(b>large) {
			 large=b;
		 }
		 i++;
		 
	 }
	 System.out.print("Larger: "+large+" smaller: "+small);
   }
}
