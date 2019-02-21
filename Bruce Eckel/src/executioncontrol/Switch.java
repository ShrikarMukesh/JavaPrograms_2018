package executioncontrol;



public class Switch {

	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			char c = (char)(Math.random() * 26 + 'a');
		      System.out.print(c + ": ");
		      
			/*System.out.println("enter c");
			Scanner scan = new Scanner(System.in);
			char c= scan.nextLine().charAt(0);*/
		      
		      switch(c)
		      {
  	            case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u': System.out.println("vowel");
		                  break;
		        case 'y':
		        case 'w': System.out.println("Sometimes a vowel");
		                  break;
		        default:  System.out.println("consonant");
		      }

 		}
	}

}
