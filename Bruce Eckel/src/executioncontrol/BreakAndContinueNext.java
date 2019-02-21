package executioncontrol;
class BreakAndContinueNext
{
	public static void main(String[] args)
	{
		int i = 0;
	    outer:
	    for(; true ;) // Can't have statements here 
	    { // infinite loop
	      inner: // Can't have statements here
	      for(; i < 10; i++)
	      {
	        System.out.println("i = " + i);	     
	        if(i == 2) 
	        {
	          System.out.println("continue");
	          System.out.println("good");
	          continue;
	        }
	        if(i == 3) 
	        {
	          System.out.println("break");
	          System.out.println();
	          System.out.println();
	          i++; // Otherwise i never
	               // gets incremented.
	          System.out.println(i);
	          break;
	        }
	        if(i == 7) 
	        {
	          System.out.println("continue outer");
	          i++; // Otherwise i never
	               // gets incremented.
	          System.out.println("hi "+i);
	          continue outer;
	        }
	        if(i == 8)
	        {
	          System.out.println("break outer");
	          break outer;
	        }
	        for(int k = 0; k < 5; k++)
	        {
	          if(k == 3)
	          {
	            System.out.println("continue inner");
	            System.out.println("i am here");
	            continue inner;
	          }
	        }
	      }
	    }
	}

}
