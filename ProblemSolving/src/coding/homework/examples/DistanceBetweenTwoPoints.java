package coding.homework.examples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         DecimalFormat decimalFormat = new DecimalFormat("0.##");
         System.out.println("enter coordinates");
         double x1=scan.nextInt();
         double y1=scan.nextInt();
         double x2=scan.nextInt();
         double y2=scan.nextInt();
         double distance=0;
         scan.close();
         distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
         System.out.println("the distance is "+decimalFormat.format(distance));
	}
}
