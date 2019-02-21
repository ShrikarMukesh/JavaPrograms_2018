package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ForEachLoop {
   
	public static void main(String[] args) {
	
		List<String> names = new ArrayList<>();
	    names.add("A");
	    names.add("B");
	    names.add("C");

	    Iterator<String> nameIterator = names.iterator();
	    nameIterator.forEachRemaining(System.out::println);
   }
}
