package my.solved.programs;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class BMRCL { 
	static double amoutIncard=1000;
	static double balnceamount;
	static Scanner scanner = new Scanner(System.in);
	static int startJourney;
	static int endJourney;
	static int flag;
	public static void main(String[] args) {
		//BMRCL b= new BMRCL();
		 System.out.println("From one station to another");
    	 startJourney=scanner.nextInt();
    	 endJourney=scanner.nextInt();  	
    	 flag=endJourney-startJourney;
    	 System.out.println(flag);
    	 moneytransaction();
    	 System.out.println("Balance amount = "+balnceamount);
		stations();	
	}
	static public void moneytransaction() {
		if(flag==1) {
			balnceamount=amoutIncard-5;
		}
		else if(flag==2) {
			balnceamount=amoutIncard-10;
		}
		else if(flag==3) {
			balnceamount=amoutIncard-12;
		}
		else if(flag==4) {
			balnceamount=amoutIncard-15;
		}
		else if(flag==5) {
			balnceamount=amoutIncard-16;
		}
		else if(flag==6) {
			balnceamount=amoutIncard-18;
		}
		else if(flag==7) {
			balnceamount=amoutIncard-20;
		}
		else if(flag==8) {
			balnceamount=amoutIncard-25;
		}
	}
	@SuppressWarnings("unused")
	static public void stations() {
 		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(1, "Banashankari");
	      hmap.put(2, "R_V_Road");
	      hmap.put(3, "Jaynagar");
	      hmap.put(4, "South_End_Circle");
	      hmap.put(5, "Lalbagh");
	      hmap.put(6, "National_College");
	      hmap.put(7, "K_R_Market");
	      hmap.put(8, "Chickpet");
	      hmap.put(9, "KBS");
	      
	      for (Entry<Integer, String> entry : hmap.entrySet()) {
	    	  
	      }   
	     
	    /*  // Display content using Iterator
		  Set set = hmap.entrySet();
		  Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
	        System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	        System.out.println(mentry.getValue()); 
	      }
	      *//**************************************************//*
	      String startJourney=null;
		  String endJourney=null;
		  Scanner scan=new Scanner(System.in);
	      System.out.println("enter stations");
	      startJourney=scan.nextLine();
	      endJourney=scan.nextLine();
		  int value = 0;
		  if(startJourney.equals("Banashankari") && endJourney.equals("R.V.Road")) {
			   value=1;
		  }
		  else if(startJourney=="Banashankari" && endJourney=="Jaynagar") {
			   value=2;
		  }
		  if(value==1) {
			  balnceamount=amoutIncard-10;
		  }
		  System.out.println(balnceamount);
		  
		  
	      Random r = new Random();
	      for (Entry<Integer, String> entry : hmap.entrySet()) {
	    	 
	    	    if(entry.getKey()==1) {
          		    if(entry.getKey()==2) {
          		    	balnceamount=amoutIncard-10; 
          		    	
          		    }
          		  System.out.println(balnceamount);
          	    }
	    	    
	            if (entry.getValue().equals("Banashankari")) {
	            	balnceamount=amoutIncard-10; 
	            }
	            else if(entry.getValue().equals("R.V.Road")) {
	            	balnceamount=amoutIncard-15; 
	            }
	            else if(entry.getValue().equals("Jaynagar")) {
	            	balnceamount=amoutIncard-20; 
	            }
	            else if(entry.getValue().equals("South End circle")) {
	            	balnceamount=amoutIncard-22; 
	            }
	            else if(entry.getValue().equals("Lalbagh")) {
	            	balnceamount=amoutIncard-25; 
	            }
	            else if(entry.getValue().equals("National College")) {
	            	balnceamount=amoutIncard-26; 
	            }
	            else if(entry.getValue().equals("K.R.Market")) {
	            	balnceamount=amoutIncard-28; 
	            }
	            else if(entry.getValue().equals("Chickpet")) {
	            	balnceamount=amoutIncard-30; 
	            }
	            else if(entry.getValue().equals("KBS")) {
	            	balnceamount=amoutIncard-34; 
	            }
	        }*/
	}
	

}
