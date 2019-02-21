package example;

import java.util.Scanner;

class NodeS
{
	int data;
	NodeS link;
}
class SingleLinkedList
{
	static NodeS first = null;
	static NodeS temp = null;
	static int elem;
	static int elem1;
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
			NodeS p = allocNode();
			System.out.println("enter the element");
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
				
		}
		private static void insert_rare()
		{
			
			NodeS p = allocNode ();
			System.out.println("enter the element");
			elem=scan.nextInt();
			p.data=elem;
			p.link=null;
			if(first==null)
			{
				first=p;
			}
			else
			{
				temp=first;
				while(temp.link!=null)
				{
					temp=temp.link;
				}
			   temp.link=p;
			}
				
		}
		
		private static void delete_front()
		{
			
			@SuppressWarnings("unused")
			NodeS x = allocNode ();
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
			    first=first.link;
			    //first=first.link.link; //two remove two nodes at a time
			    //first=first.link.link.link;//two remove three node at a time
			    
			}			
		}
		 @SuppressWarnings("unused")
		private static void delete_rare()
			{
				
				NodeS x = allocNode ();
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
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					System.out.println("element deleted"+temp.link.data);
					temp.link=null;
				
				}
				
			}

	    private static void disp()
		{
				
			//	NodeS temp = allocNode ();
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
	private static NodeS allocNode () {
		return new NodeS ();
	}
}
