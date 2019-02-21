package example;

import java.util.Scanner;

class Node1
{
	int data;
	Node1 rlink;
	Node1 llink;
}
class DoublyLinkedList 
{
	 static Node1 first = null;
	 static Node1 temp = null;
	 static int elem;
	 static Scanner scan=new Scanner(System.in);
	 public static void main(String[] args) 
	 {
		 while(true)
			{
				System.out.println("press 1 to insert_front");
				System.out.println("press 2 to insert_rare");
				System.out.println("press 3 to delete_front");
				System.out.println("press 4 to delete_rare");
				System.out.println("press 5 to display");

				int choice=scan.nextInt();
				switch(choice)
				{
				case 1:insert_front();
				      break;
				       
				case 2:insert_rare();
				       break;
				case 3:delete_front();
				       break;
				case 4:delete_rare();
			       break;  
				case 5:disp();
			       break; 
				default:System.exit(0);
				       break;
				}
			}
	 }
	 private static void insert_front()
	 {
			
			Node1 p = allocNode ();
			System.out.println("enter the element");
			elem=scan.nextInt();
			p.data=elem;
			p.rlink=null;
			p.llink=null;
			if(first==null)
			{
				first=p;
			}
			else
			{
				p.rlink=first;
				first.llink=p;
				first=p;
			}
				
	}
	 private static void insert_rare()
	 {
			
			Node1 p = allocNode ();
			System.out.println("enter the element");
			elem=scan.nextInt();
			p.data=elem;
			p.llink=null;
			p.rlink=null;
			if(first==null)
			{
				first=p;
			}
			else
			{
				temp=first;
				while(temp.rlink!=null)
				{
					temp.rlink=temp;
				}
			    temp.rlink=p;
			    p.llink=temp;
			}
				
	 }
	 private static void delete_front()
		{
			
			@SuppressWarnings("unused")
			Node1 x = allocNode();
			if(first==null)
			{
				System.out.println("deletion not possible");
			}
			else if(first.rlink==null)
			{
				System.out.println("element deleted"+first.llink);
				
				first=null;
			}
			else
			{
			    System.out.println("element deleted"+first.data);	
			    x=first;
			    first=first.rlink;
			    first.llink=null;
			    //first=first.link.link; //two remove two nodes at a time
			    //first=first.link.link.link;//two remove three node at a time
			    
			}			
				
		}
		 @SuppressWarnings("unused")
		private static void delete_rare()
		{
			
			Node1 x = allocNode();
			if(first==null)
			{
				System.out.println("deletion not possible");
			}
			else if(first.rlink==null)
			{
				System.out.println("element deleted"+first.data);
				first=null;
			}
			else
			{
				temp=first;
				while(temp.rlink.rlink!=null)
				{
					temp=temp.rlink;
				}
				System.out.println("element deleted"+temp.rlink.data);
				temp.rlink=null;
			}
				
	 }			
	 private static void disp()
     {
				
				Node1 temp = allocNode ();
				if(first==null)
				{
					System.out.println("display not possible");
				}
				else if(first.rlink==null)
				{
					System.out.println("element display"+first.data);
					
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						System.out.println(temp.data);
						temp=temp.rlink;
					}
					
				}
	 }
	 
	 private static Node1 allocNode () {
			return new Node1 ();
		}
}
