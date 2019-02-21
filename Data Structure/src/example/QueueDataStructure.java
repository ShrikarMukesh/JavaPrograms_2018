package example;

import java.util.Scanner;

class QueueDataStructure {

	static int f=0;
	static int r=-1;
	static int size=4;
	static int q[]=new int[4];
	static  Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
        int choice;
		while(true)
		{
			System.out.println("Enter press 1 for insert element");
			System.out.println("Enter press 2 for delete element");
			System.out.println("Enter press 3 for DISPLAY element");
			System.out.println("Enter press 4 to exit");
			System.out.println("enter your choice");
			choice=scan.nextInt();
			switch(choice)
			{
			    case 1:insert();
			               break;
			    case 2:delete();
	               break;
			    case 3:display();
	               break;
	               default:
	            	System.exit(choice);
	               break;
			}
	
		}		
	}
	 private static  void insert()
	 {
	    	if(r==size-1)
	    	{
	    		System.out.println("insert is not possible");
	    	}
	    	else
	    	{
	    		System.out.println("enter the element");
	    		int elem=scan.nextInt();
	    		++r;
	            q[r]=elem;	    		
	    	}
	 }
	 private static  void delete()
	    {
	    	
	    	if(r==-1||f>r)
	    	{
	    		System.out.println("delete is not possible");
	    	}
	    	else
	    	{
	    		System.out.println("Element deleted");
	    		++f; 		
	    	}
	   }
	    private static  void display()
	    {
	    	
	    	if(r==-1||f>r)
	    	{
	    		System.out.println("display is not possible");
	    	}
	    	else
	    	{
	    		System.out.println("elements in the queue");
	    		for(int i=f;i<=r;++i)
	    		{
	    			System.out.println(q[i]);
	    		}
	    	}
	    }

}
