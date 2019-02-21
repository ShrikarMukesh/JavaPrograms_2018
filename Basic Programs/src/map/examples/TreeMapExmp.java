package map.examples;

import java.util.Map;
import java.util.TreeMap;
class Book1 {    
	int id;    
	String name,author,publisher;    
	int quantity;    
	public Book1(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}    
}    
public class TreeMapExmp {    
   
	public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Book2> map=new TreeMap<Integer,Book2>();    
    //Creating Books    
    Book2 b1=new Book2(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Book2 b2=new Book2(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
    Book2 b3=new Book2(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    map.put(2,b2);  
    map.put(1,b1);  
    map.put(308,b3);  
    System.out.println(map.containsKey(1));
    System.out.println(map.containsValue(b1));
    System.out.println(b1);
    //Traversing map  
    for(Map.Entry<Integer, Book2> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book2 b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
   
  }    
}    