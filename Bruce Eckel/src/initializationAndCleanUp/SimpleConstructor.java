package initializationAndCleanUp;
class Rock 
{
	  Rock(int i) 
	  { // This is the constructor
	    System.out.println("Creating Rock "+i);
	  }
	}
public class SimpleConstructor {

	public static void main(String[] args)
	{
		 for(int i = 0; i < 10; i++)
		     new Rock(i);
	}

}
