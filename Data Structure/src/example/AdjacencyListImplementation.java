package example;
class NodeList {

	char info;
	NodeList next;
	EdgeList source;

	NodeList () {
		next = null;
		source = null;
	}
} // end of NodeList class
class EdgeList {

	NodeList ptr;
	EdgeList link;

	EdgeList () {
		ptr = null;
		link = null;
	}
} // end of EdgeList class
public class AdjacencyListImplementation
{
	public static void main (String... args) {
		System.out.print ('\n');

		NodeList a = new NodeList ();
		NodeList b = new NodeList ();
		NodeList c = new NodeList ();
		NodeList d = new NodeList ();
		NodeList e = new NodeList ();

		a.info = 'A';
		b.info = 'B';
		c.info = 'C';
		d.info = 'D';
		e.info = 'E';

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		//e.next = null; 
		/*------------------*/
		EdgeList u = new EdgeList ();
		EdgeList v = new EdgeList ();
		EdgeList w = new EdgeList ();

		u.ptr = b;
		v.ptr = d;
		w.ptr = e;

		u.link = v;
		v.link = w;

		a.source = u;

		/*-------------------*/

		u = new EdgeList ();
		v = new EdgeList ();
		w = new EdgeList ();
		EdgeList y = new EdgeList ();
 
		/*--------------------this four nodes for C*/
		
		u.ptr = a;
		v.ptr = b;
		w.ptr = d;
		y.ptr = e;

		u.link = v;
		v.link = w;
		w.link = y;
		// y.link = null;

		c.source = u;
		/*-------------------*/
		
		u = new EdgeList ();
		u.ptr = a;
		//u.link = null;
		d.source = u;

		/*-------------------*/
		u = new EdgeList ();
		v = new EdgeList ();
		u.ptr = c;
		v.ptr = b;
		u.link = v;
		//v.link = null
		e.source = u;
		/*-------------------*/

		EdgeList z;

		while (a != null) {

			System.out.print (a.info +" : ");
			z = a.source;

			while (z != null) {
				System.out.print (z.ptr.info +" -> ");
				z = z.link;
			}
			System.out.print ("X");

			System.out.print ('\n');
			a = a.next;
		} // end of while 



		System.out.print ('\n');
	} // end of main method ...

} // end of AdjacencyListImplementation class ...

