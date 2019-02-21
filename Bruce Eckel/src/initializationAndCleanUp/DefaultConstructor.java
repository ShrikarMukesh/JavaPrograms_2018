package initializationAndCleanUp;

class Bird 
{
	  int i;
	 
}
class Banana { 
	void f
	(int i) 
	{
		System.out.println(i);
		System.out.println("first");
		System.out.println(i);
    } 
}


class Hat {
	  Hat(int i) 
	  {
		  System.out.println(i);
	  }
	  Hat(double d) {
		  
	  }
	}
class DefaultConstructor
{
	 public static void main(String[] args) {
		    Bird nc = new Bird(); 
		    nc.i=10;
		    new Hat(12);
		    Banana a = new Banana(), b = new Banana();
		    a.f(1);
		    b.f(2);
	 }
}
