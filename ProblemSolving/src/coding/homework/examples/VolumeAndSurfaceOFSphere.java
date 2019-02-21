package coding.homework.examples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VolumeAndSurfaceOFSphere {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 DecimalFormat decimalFormat= new DecimalFormat("0.##");
		 System.out.println("enter radius");
		 double radius=scanner.nextDouble();
		 double volume=(4.00/3)*Math.PI*Math.pow(radius, 3);
		 double area=(4.00)*Math.PI*Math.pow(radius, 2);
		 System.out.println("the voume "+decimalFormat.format(volume));
		 System.out.println("the voume "+decimalFormat.format(area));
		 scanner.close();
	}
}
