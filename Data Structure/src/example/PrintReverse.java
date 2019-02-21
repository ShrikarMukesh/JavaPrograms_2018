package example;

import java.util.Scanner;

class PrintReverse {
static class MyNode<T> {
		
		T info;
		MyNode<T> next;
		/*MyNode (T v) {
			this.info = v;
		}*/
		/*public String toString () {
			return value +" ";
		}*/
		
	} // end of MyNode class
	
	@SuppressWarnings("unchecked")
	private static <T> MyNode<T> _createList () {
		MyNode<T> start = null;
		MyNode<T> temp = null;
		Scanner myScanner = new Scanner (System.in);
		
		while (true) {
			
			System.out.println("\t To create node press y else n : ");
			int choice = myScanner.next().charAt(0);
			
			if (choice == 'N' || choice == 'n') {
				break;
			} // end of if 
			
			else {
				if (start == null) {
					start = _allocNode ();
					System.out.println("\t Please enter the data : ");
					start.info = (T) new Integer (myScanner.nextInt());
					temp = start;
				} // end of if
				else {
					start.next = _allocNode ();
					System.out.println("\t Please enter the data : ");
					start.next.info = (T) new Integer (myScanner.nextInt());
					start = start.next;
				} // end of else 
			} // end of else 
			
		} // end of while 
		
		start = temp;
		
		myScanner.close();
		return start;
	} // end of _createList method
	
	private static <T> MyNode<T> _allocNode () {
		return new MyNode<> ();
	} // end of _allocNode method
	
	private static <T> void _printList (MyNode<T> start) {
		System.out.print ("\n\t The content of list : ");
		while (start != null) {
			System.out.print (start.info +"->");
			start = start.next;
		}
		System.out.println("X");
		
	}
	private static <T> void _printReverse (MyNode<T> start) { 
		if (start == null) {
			return;
		}
		System.out.println(start.info);
		_printReverse(start.next);
		if (start.next != null)
			System.out.println(start.info);
	}
	 
	public static void main(String[] args) {
		
		MyNode<Integer> start = _createList ();
		_printList (start);
		_printReverse (start);
		
	} // end of main method 
	
	
} // end of LinkedListGeneric class

