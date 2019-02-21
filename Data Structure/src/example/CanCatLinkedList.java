package example;

import java.util.Scanner;

class NodeC
{
	int data;
	NodeC link;
}
class CanCatLinkedList 
{

	static int i,elem;
	static Scanner scan = new Scanner(System.in);
      
	public static void main(String[] args) 
	{		
		
		NodeC first1=null;
		NodeC	first2=null;
		System.out.println("enter the first linked list");
		first1=create(first1);
		System.out.println("enter the second linked list");
		first2=create(first2);
		first1=concat(first1, first2);
		System.out.println("concat linked list is");
		disp(first1);
	}
	private static NodeC create(NodeC first)
	{
		
		
		int choice;
		do
		{
			NodeC p = allocnode();
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
	
	private static NodeC concat(NodeC first1,NodeC first2)
	{
	
		NodeC temp; 
		temp=first1;
		while(temp.link!=null)
		{
			temp=temp.link;
		}
		temp.link=first2;
		return first1;
	}
    private static void disp(NodeC first)
    {
    
    	NodeC temp; 
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
	private static NodeC allocnode()
	{
		return new NodeC();
	}

}
