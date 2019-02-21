package example;

import java.util.Scanner;

class BSTNode {
	
	int info;
	BSTNode left;
	BSTNode right;
}

class BSTDemo1 
{
public static void main (String... args) {
		
		char choice;
		Scanner scanner = new Scanner (System.in);
		
		BSTNode root = allocNode ();
		System.out.print ("\n\t Please enter the data for the root: ");
		root.info = scanner.nextInt ();
		
		while (true) {
			
			System.out.print ("\n\t Press y/Y to create more nodes ");
			System.out.print ("\n\t Press n/ to stop ");
			System.out.print ("\n\t Please enter your choice : ");
			
			choice = scanner.next ().charAt (0);
			
			if (choice == 'n' || choice == 'N') {
				break;
			}
			
			System.out.print ("\n\t Please enter the data : ");
			
			//int item = scanner.nextInt ();
			
			createBST (root, scanner.nextInt ());
			
		} // end of while loop
		
		System.out.print ("\n\t -----------------------------------\n");
		inorderWalk (root);
		scanner.close();
	}// end of main function
	
	private static void inorderWalk (BSTNode root) {
		
		if (root == null) {
			return;
		}
		
		else {
			inorderWalk (root.left);
			System.out.print ("\t"+ root.info);
			inorderWalk (root.right);
		}
	}
	
	/*Creates a binary search tree*/
	private static void createBST (BSTNode root, int item) {
		
		if (item < root.info && root.left != null) {
			createBST (root.left, item);
		}
		
		else if (item > root.info && root.right != null) {
			createBST (root.right, item);
		}
		
		else {
			
			BSTNode n = allocNode ();
			n.info = item;
			
			if (item < root.info) {
				root.left = n;
				return;
			}
			
			else {
				root.right = n;
				return;
			}
			
		}
		
	} // end of createBST
	
	/*
	Returns a node
	*/
	private static BSTNode allocNode () {
		return new BSTNode ();
	}
	
}

