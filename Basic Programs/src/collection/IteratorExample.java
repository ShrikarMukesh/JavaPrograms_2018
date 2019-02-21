package collection;


/*boolean hasNext()
E next()
default void  remove()
default void  forEachRemaining(Consumer<? super  E> action)*/
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
   
	public static void main(String[] args) {
		 // Create a list of strings
	    List<String> names = new ArrayList<>();
	    names.add("A");
	    names.add("B");
	    names.add("C");
	    // Get an iterator for the list
	    Iterator<String> nameIterator = names.iterator();
	    // Iterate over all elements in the list
	    while (nameIterator.hasNext()==true) {
	      // Get the next element from the list
	    	
	      String name = nameIterator.next();
	      System.out.println(name);
	    }
   }
}
