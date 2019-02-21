package executioncontrol;
class A
{
	
   int a=22;
	public A()
	{
		foo();
	}
	public void foo()
	{
		System.out.println("A : "+a);
		System.out.println("lll");
	}
}
class Aptitude extends A 
{
   int a=11;
   public Aptitude()
   {
	 foo();
   }
 public void foo()
 {
	 
	 System.out.println("Pra : "+a);
 }

	public static void main(String[] args)
	{
	  Aptitude p = new Aptitude();
	  p.foo();
	}
}
