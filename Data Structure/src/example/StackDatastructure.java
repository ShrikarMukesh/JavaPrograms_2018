package example;

import java.util.Scanner;

class StackDatastructure 
{
	static int elem;
	static int top=-1;
	static int size=4;
	static int s[]=new int[4];
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
	
		
		StackDatastructure s = new StackDatastructure();
		int choice;
		
		while(true)
		{
			System.out.println("Enter press 1 for PUSH element");
			System.out.println("Enter press 2 for POP element");
			System.out.println("Enter press 3 for DISPLAY element");
			System.out.println("Enter press 4 to exit");
			System.out.println("enter your choice");
			choice=scan.nextInt();
			switch(choice)
			{
			    case 1:s.push();
			               break;
			    case 2:s.pop();
	               break;
			    case 3:s.display();
	               break;
	               default:
	            	System.exit(choice);
	               break;
			}
	
		}
	}
    private  void push()
    {
    	
    	if(top==size-1)
    	{
    		System.out.println("push is not possible");
    	}
    	else
    	{
    		System.out.println("enter the element");
  
    		elem=scan.nextInt();
    		++top;
    		s[top]=elem;
    		
    		
    	}
    }
    private  void pop()
    {
    	
    	if(top==-1)
    	{
    		System.out.println("pop is not possible");
    	}
    	else
    	{
    		System.out.println("Element deleted");
    		--top; 		
    	}
    }
    private  void display()
    {
    	if(top==-1)
    	{
    		System.out.println("display is not possible");
    	}
    	else
    	{
    		System.out.println("elements in the stack");
    		for(int i=0;i<=top;++i)
    		{
    			System.out.println(s[i]);
    		}
    	}
    }
}
