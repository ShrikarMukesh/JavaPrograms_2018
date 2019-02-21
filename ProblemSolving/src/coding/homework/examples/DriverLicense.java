package coding.homework.examples;

import java.util.Scanner;

public class DriverLicense {

	public static void main(String[] args) {
		final int size=20;
		char[] correctAnswer= {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		char[] incorrectAnswers=new char[size];
        char singleAnswer=' ';
        int wrongAnswercounter=0;
        boolean wronganswer;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<size;i++) {
        	do {
        		wronganswer=false;
        		System.out.println("please enter your answer #"+(i+1)+": ");
        		singleAnswer=scan.nextLine().toUpperCase().charAt(0);
        		if(singleAnswer !='A' &&singleAnswer !='B' &&singleAnswer !='C' &&singleAnswer !='D' ) {
        			System.out.println("Invald input please re-enter your answer.\n");
        			wronganswer=true;
        		}
        	}while(wronganswer);
        	if(incorrectAnswers[i] != singleAnswer) {
        		incorrectAnswers[i] = singleAnswer;
        		wrongAnswercounter++; 
        	}
        }
        scan.close();
        System.out.println(wrongAnswercounter >=5 ? "sorry you have failed":"Congratulations you have passed");
        System.out.println("you have answered "+(size-wrongAnswercounter)+"correctly and "+wrongAnswercounter+
        "incorrectly. ");
        for(int i=0;i<size;i++) {
        	if(incorrectAnswers[i] !='\u0000') {
        		System.out.println("you answerd question #"+(i+1)+"incorrectly .your answer was"+
        	                 incorrectAnswers[i]+"correct answer is "+correctAnswer[i]+".");
        	}
        }
	}

}
