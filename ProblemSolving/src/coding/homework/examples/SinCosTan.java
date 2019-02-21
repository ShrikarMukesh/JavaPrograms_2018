package coding.homework.examples;

import java.util.Random;
public class SinCosTan {

	public static void main(String[] args) {
		
		Random rand = new Random();
		double number = rand.nextInt(21)+20;
		System.out.println("The number is "+number);
		System.out.println("sin = "+Math.sin(number));
		System.out.println("sin = "+Math.cos(number));
		System.out.println("sin = "+Math.tan(number));
	}
}
