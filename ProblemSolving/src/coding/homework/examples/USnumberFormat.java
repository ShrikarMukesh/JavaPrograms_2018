package coding.homework.examples;
import java.util.Random;
public class USnumberFormat {
	
	public static void main(String[] args) {
		Random rand= new Random();
	    int first=rand.nextInt(7);
	    int second=rand.nextInt(7);
	    int third=rand.nextInt(7);
	    int middle=rand.nextInt(741);
	    int last =rand.nextInt(9999);
	    String middleString;
	    String lastString;
	    middleString=Integer.toString(middle);	
	    lastString=Integer.toString(last);
	    while(middleString.length() <3) {
	    	middleString= "0"+ middleString;
	    }
        while(lastString.length() <3) {
	    	lastString="0"+lastString;
	    }
        System.out.println("phone number");
        System.out.println(first+""+second+""+third+""+"-"+middleString+"-"+lastString);
	}
}