package example;
import java.util.Scanner;

class Node2
{
	int data;
	Node2 link;
}
public class SinglyLLNew {
   
	static Node2 first = null;
	static Node2 temp = null;
	static int elem;
	static int elem1;
	 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		while(true)
		{
			System.out.println("press 1 to insert two nodes at front");
			System.out.println("press 2 to insert two nodes from rear");
			System.out.println("press 1 to delete two nodes at front");
			System.out.println("press 2 to delete two nodes from rear");
			System.out.println("press 5 to display");

			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:insert_twoNodesat_Front();
			      break;
			      
			case 2:insert_twoNodesat_rear();
		      break;
			      
			       
			case 3:delete_twoNodesFrom_Front();
			       break;
			       
			case 4:delete_twoNodesFrom_rear();
					       break;
			
			case 5:disp();
		       break; 
			default:System.exit(0);
			       break;
			}
		}
	}
	private static void insert_twoNodesat_Front()
	{
		
		Node2 p = allocNode ();
		Node2 q= allocNode();
		System.out.println("enter the element");
		elem=scan.nextInt();
		elem1=scan.nextInt();
		p.data=elem;
		q.data=elem1;
		p.link=q;
		if(first==null)
		{
			first=p;
		
		}
		else
		{
			p.link=q;
			q.link=first;
			first=p;
		}
			
	}
	private static void insert_twoNodesat_rear()
	{
		
		Node2 p = allocNode ();
		Node2 q= allocNode();
		System.out.println("enter the element");
		elem=scan.nextInt();
		elem1=scan.nextInt();
		p.data=elem;
		q.data=elem1;
		p.link=q;
		q.link=null;
		if(first==null)
		{
			first=p;
		
		}
		else
		{   
			temp=first;
			while(temp.link !=null){
				temp=temp.link;
			}
			temp.link=p;
			p.link=q;
			q.link=null;
		}
			
	}
	private static void delete_twoNodesFrom_Front()
	{
		
		@SuppressWarnings("unused")
		Node2 x = allocNode ();
		
		if(first==null)
		{
			System.out.println("deletion not possible");
		}
		else if(first.link==null)
		{
			System.out.println("element deleted"+first.data);
			first=null;
		}
		else
		{
		    System.out.println("element deleted"+first.data);	
		    x=first;
		    first=first.link.link; //two remove two nodes at a time
		    //first=first.link.link.link;//two remove three node at a time
		}	
			
	}
	 private static void delete_twoNodesFrom_rear()
		{
			
			@SuppressWarnings("unused")
			Node2 x = allocNode ();
			if(first==null)
			{
				System.out.println("deletion not possible");
			}
			else if(first.link==null)
			{
				System.out.println("element deleted"+first.data);
				first=null;
			}
			else
			{
				temp=first;
				while(temp.link.link.link!=null)
				{
					temp=temp.link;
				}
				System.out.println("element deleted"+temp.data);
				temp.link=null;
				
			}
			
		}
	private static void disp()
	{
		Node2 temp = allocNode ();
		if(first==null)
		{
			System.out.println("display not possible");
		}
		else if(first.link==null)
		{
			System.out.println("element display"+first.data);
			
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.link;
			}
			
		}		
				
	}
	private static Node2 allocNode () {
		return new Node2 ();
	}
}
