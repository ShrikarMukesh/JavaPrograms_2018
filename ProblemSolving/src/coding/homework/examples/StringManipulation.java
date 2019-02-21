package coding.homework.examples;
import java.util.Random;
import java.util.Scanner;
public class StringManipulation {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		Random rand= new Random();
		System.out.println("enter first name ");
		String firstname=scan.next();
		System.out.println("enter Second name");
		String lastname=scan.next();
		scan.close();
		String finalname=firstname.substring(0,1);
		while(lastname.length()<5) {
			System.out.println("please enter at least 5 char");
		}
		finalname+= lastname.substring(0, 5);
		finalname+= rand.nextInt(99);
		System.out.println(finalname);
	}
}
