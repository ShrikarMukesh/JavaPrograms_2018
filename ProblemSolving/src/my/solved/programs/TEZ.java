package my.solved.programs;

import java.util.Random;
import java.util.Scanner;

public class TEZ {
	
	static Scanner scanner = new Scanner(System.in);
	static int transferAmount;
	static double totalAmount=10000;
	static double balanceAmount;
	static int rewards[]= {51,31,17,13,11}; 
	static Random random = new Random();
	static int pin;
	static double balance;
    public static void main(String[] args)throws Exception  {  
    	//TEZ t = new TEZ();
       login();
	   //requests();
       
    }
    static public void login() {
    	System.out.println("ENTER GOOGLE PIN");
        pin=scanner.nextInt();
        credentials();	
    }
    static public void credentials() {
   	 
   	 @SuppressWarnings("unused")
		String userName="Shrikar";
		@SuppressWarnings("unused")
		String emailId ="mukesh.shrikar7@gmail.com";
   	    int tezpassword=6206;
   	    if(pin==tezpassword) {
   	    	System.out.println("HEllO Shrikar");
   		    requests();
   	    }
   	    else {
   		  System.out.println("Sorry.. You have entered Wrong password please try again");
   		  login();
   	    }
    }
    static private void trans() {
      
      int transaction=1;
     
   	  while(transaction<=5) {  
   		  
   		  System.out.println("Enter an amount to transfer");
   		  transferAmount=scanner.nextInt();
   		  balanceAmount=totalAmount - transferAmount;
   		  
   		  System.out.println("Your Curent balance is "+" "+balanceAmount);
   		  
   		  if(transaction <=5) {	  
   			  
   			  System.out.println("congratulations!!! You earned ");
   			  int x=rewards[random.nextInt(rewards.length)];
   			  System.out.println(x);
   			  System.out.println("amount "+x+" "+"Has be Credited to your account");
   			  balanceAmount=balanceAmount+x;
   			   balance=balanceAmount;
   			  System.out.println();
   			  System.out.println("your current balance is"+balanceAmount);
   			  System.out.println("*************==****************");
   			  transaction++;
   			  totalAmount=balance;
   			  forcontinue();
   			 
   		 }
   		 
      }
   
	  System.out.println("Sorry Better luck next time");
    }
    static public void forcontinue(){
      	char c=' ';
   	    switch(1){
		  case 1:
			  System.out.println("Do You want to continue...");
				  c=scanner.next().charAt(0);
	          if(c=='y') {
	             requests();
	          }
	          else if(c=='n') {
	        	  System.exit(0);
	          } 
	   }
     }
     static public void requests() {
    	 Random random=new Random();
    	 
    	 switch(1) {
    	    case 1:int x = random.nextInt(6);
    	    	if(x==1){
          	    	System.out.println("Srinidhi requesting  3000 USD");
          	    	trans();
    	    	}
    	        else if(x==2){
    	        	System.out.println("Vikranth requesting  1000 USD");
    	        	trans();
    	        }
    	        else if(x==3){
    	        	System.out.println("Veeru requesting  1500 USD");
    	        	trans();
    	        }
    	        else if(x==4){
    	        	System.out.println("Aaquib requesting  1500 USD");
    	        	trans();
    	        }
    	        else if(x==5){
    	        	System.out.println("Jaipal requesting  500 USD");
    	        	trans();
    	        }
    	        else if(x==0){
    	        	requests();
    	        }
    	 }
     }
     
}
