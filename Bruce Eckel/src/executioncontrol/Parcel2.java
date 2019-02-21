package executioncontrol;
class Parcel2 
{
	  class Contents 
	  {
	    private int i = 11;
	    public int value() 
	    {
	    	System.out.println("kjjkj");
	    	return i;
	    }
	  }
	  class Destination 
	  {
	    private String label;
	    Destination(String whereTo) 
	    {
	      label = whereTo;
	    }
	    String readLabel()
	    {
	    	System.out.println();
           return label;
        }
	  }
	  public Destination to(String s)
	  {
	    return new Destination(s);
	  }
	  public Contents cont()
	  {
	    return new Contents();
	  }
	  public void ship(String dest)
	  {
	   // Contents c = cont();
	    Destination d = to(dest);
	    System.out.println(d.readLabel());
	  }
	  public static void main(String[] args)
      {
	    Parcel2 p = new Parcel2();
	    p.ship("Tanzania");
	    Parcel2 q = new Parcel2();
	    // Defining references to inner classes:
	    Parcel2.Contents c = q.cont();
	    c.value();
	   // Parcel2.Destination d = q.to("Borneo");
	    
	  
	  }

}
