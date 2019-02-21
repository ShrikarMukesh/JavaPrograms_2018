package example;
import java.util.Scanner;
class NodeQ
{
	int data;
	NodeQ link;
}
class QueueUsingLinkedList {

	static Scanner scan = new Scanner(System.in);
	static int elem;
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("Press 1 to insert");
			System.out.println("Press 2 to display");
			System.out.println("Press 3 to display");
			int choice=scan.nextInt();
			switch(choice)
			{
			  case 1:insert();
		      break;	       
	          case 2:delete();
		      break;
		      case 3:disp();
		      break;
			}
		}
	}
	private static void insert()
	{
		NodeQ p= allocnode();
		NodeQ first= allocnode();
		NodeQ temp= allocnode();
		System.out.println("enter an element");
		elem=scan.nextInt();
		p.data=elem;
		p.link=null;
		
		if(first==null){
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
	private static void delete()
	{
	
		NodeQ first= allocnode();

		if(first==null){
			System.out.println("deletion not possible");
		}
		else if(first.link==null)
		{
		  System.out.println("element delete"+first.data);
		  first=null;
		}				
	}
	private static void disp()
	{
		NodeQ first= allocnode();
		NodeQ temp= allocnode();
		if(first==null)
		{
			System.out.println("display not posible");
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
	private static NodeQ allocnode()
	{
		return new NodeQ();
	}

}
