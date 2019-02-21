package executioncontrol;
class Test
{

	public void expect(String[] strings) {
		// TODO Auto-generated method stub
		
	}
	
}
class CommaOperatorForForLoop {
	
	static Test monitor = new Test();
	
	  public static void main(String[] args)
	  {
		  for(int i = 1, j = i + 10; i < 5;i++, j = i * 2) 
		  {
			      System.out.println("i= " + i + " j= " + j);
		  }
		  System.out.println("next");
		  for(int i = 1, j = i; i < 5;i++,j = i * 2,++j) 
		  {
			      System.out.println("i= " + i + " j= " + j);
		  }
		  
	  }
}
