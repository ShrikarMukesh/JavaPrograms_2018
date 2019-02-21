package initializationAndCleanUp;

class Apricot 
{
	  void pick()
	  {
	
		  System.out.println("mukesh"); 
	  }
	  void pit() { 
		  pick(); /* ... */
	  }
	}
class A
{
	A map()
	{
		System.out.println("hi");
		return this;
	}
}
public class ThisKeyWord
{
	 int i = 0;
	 ThisKeyWord increment()
	 {
	    i++;
	    return this;
	
	  }
	  void print()
	  {
	    System.out.println("i = " + i);
	  }
	  public static void main(String[] args)
	  {
		  ThisKeyWord x = new ThisKeyWord();
		  new A().map();
		  new Apricot().pit();;;;;;
		  
	    x.increment().increment().increment().print();
	  }
}
