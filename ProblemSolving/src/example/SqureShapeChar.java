package example;

import java.util.Scanner;

class SqureShapeChar {
    public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	   System.out.println("enter the number of rows ");
	   int rows=scanner.nextInt();
	   System.out.println("enter the number of columns");
	   int col=scanner.nextInt();
	   if(rows==0||col==0) {
		   //
	   }else {
		   for(int i=1;i<=rows;i++) {
			   for(int j=1;j<=col;j++) {
				   System.out.print("B");
			   }
			   System.out.println();
		   }
	   }
    }
}
