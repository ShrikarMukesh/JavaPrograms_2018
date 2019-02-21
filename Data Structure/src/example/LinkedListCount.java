package example;

import java.util.Scanner;

class NodeT
{
	int data;
	NodeT link;
}
public class LinkedListCount {

	static int elem;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int count=0;
		NodeT first=null;
		System.out.println("Enter the linked list");
		first=create(first);
		count=lincnt(first);
		System.out.println("number of nodes in the LinkedList is"+" "+count);
		
		
	}
	private static NodeT create(NodeT first)
	{
		
		int choice;
		do
		{
			NodeT p = allocnode();
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
	private static int lincnt(NodeT first)
	{
		int count=0;
		NodeT temp;
		temp=first;
		while(temp!=null)
		{
			++count;
			temp =temp.link;
		}
		return count;
	}
	
	private static NodeT allocnode()
	{
		return new NodeT();
	}

}
