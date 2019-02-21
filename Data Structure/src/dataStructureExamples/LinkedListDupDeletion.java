package dataStructureExamples;

import java.util.Scanner;
class Node
{
	int data;
	Node link;
}
class LinkedListDupDeletion 
{
	static int elem;
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[])
    {
    	Node first=null;
    	System.out.println("enter the linked list");
    	first=create(first);
    	System.out.println("linked list before deletion");
    	disp(first);
    	first=lindup(first);
    	System.out.println("linked list after deletion");
    	disp(first);
    	
    	
    }
    private static Node create(Node first)
	{
		
		int choice;
		do
		{
			Node p = allocnode();
			System.out.println("enter the elemnt");
			elem=scan.nextInt();
			p.data=elem;
			p.link=null;
			if(first==null)
			{
				first=p;
			}
			else
			{
				p.link=first;
				first=p;
			}
			
			System.out.println("do u wnt to continue");
			choice=scan.nextInt();
		}while(choice==1);
		return first;
	}
    private static void disp(Node first)
    {
    
    	Node temp; 
    	if(first==null)
    	{
    		System.out.println("display is not possible");
    	}
    	else if(first.link==null)
    	{
    		System.out.println(first.data);
    	}
    	else
		{
			temp=first;
			while(temp !=null)
			{
				System.out.println(temp.data);
				temp=temp.link;
			}
		}
    }	
    private static Node lindup(Node first)
    {
    	Node temp1;
    	Node temp2;
    	Node temp3;
    	if(first ==null)
    	{
    		System.out.println("duplicates are not present");
    		return first;
    	}
    	else if(first.link==null)
    	{
    		System.out.println("duplicates not present");
    		return first;
    	}
    	else
    	{
    		temp1=first;
    		while(temp1.link!=null)
    		{
    			temp2=temp1;
    			temp3=temp1.link;
    			while(temp3 !=null)
    			{
    				if(temp1.data==temp3.data)
    				{
    					temp2.link=temp3.link;
    					temp3=temp2.link;
    				}
    				else
    				{
    					temp2=temp3;
    					temp3=temp3.link;
    				}
    			}
    			temp1=temp1.link;
    		}
    		return first;
    	}
    }
    private static Node allocnode()
    {
    	return new Node();
    }
}
