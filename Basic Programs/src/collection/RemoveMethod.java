package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveMethod {
   
	public static void main(String[] args) {
	
		 // Create a list of strings
	    List<String> names = new ArrayList<>();
	    names.add("A");
	    names.add("B");
	    names.add("C");

	    Iterator<String> nameIterator = names.iterator();
	    // Iterate over all elements in the list
	    while (nameIterator.hasNext()!=false) {
	      // Get the next element from the list
	      String name = nameIterator.next();
	      System.out.println(name);
	      //nameIterator.remove();
	    }
	    nameIterator.remove();
	    System.out.println(names);
   }
}
