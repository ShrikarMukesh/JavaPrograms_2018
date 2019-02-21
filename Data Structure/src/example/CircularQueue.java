package example;

import java.util.Scanner;

class CircularQueue 
{
	static int f=0;
	static int r=-1;
	static int size=5;
	static int count=0;
	static int q[]=new int[5];
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
	    	if(count==size)
	    	{
	    		System.out.println("insertion is not possible");
	    	}
	    	else
	    	{
	    		System.out.println("enter the element");
	    		int elem=scan.nextInt();
	    		r=(r+1)%size;
	            q[r]=elem;
	            ++count;
	    	}
	 }
	 private static  void delete()
	    {
	    	
	    	if(count==0)
	    	{
	    		System.out.println("delete is not possible");
	    	}
	    	else
	    	{
	    		System.out.println("Element deleted");
	    		f=(f+1)%size;
	    		--count;
	    	}
	   }
	    private static  void display()
	    {
	    	int f1; 
	    	f1=f;
	    	if(count==0)
	    	{
	    		System.out.println("display is not possible");
	    	}
	    	else
	    	{
	    		System.out.println("elements in the Circular"
	    				+ ""
	    				+ "queue");
	    		for(int i=1;i<=count;i++)
	    		{
	    			System.out.println(q[f1]);
	    			f1=(f1+1)%size;
	    					
	    		}
	    	}
	    }

}
