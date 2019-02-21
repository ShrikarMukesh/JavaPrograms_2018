package map.examples;

import java.util.*;


public class MapExample {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
    	/*Map<Integer,String> map=new HashMap<Integer,String>();  
    	  map.put(100,"Amit");  
    	  map.put(101,"Vijay");  
    	  map.put(102,"Rahul");
    	  for(Map.Entry m:map.entrySet()) {
    		  System.out.println(m.getKey()+" "+m.getValue());
    	  }*/
    	
		Map map=(Map) new HashMapExmp();  
    	    //Adding elements to map  
    	    map.put(1,"Amit");  
    	    map.put(5,"Rahul");  
    	    map.put(2,"Jai");  
    	    map.put(6,"Amit");  
    	    //Traversing Map  
			Set set=map.entrySet();//Converting to Set so that we can traverse  
    	    Iterator itr=set.iterator();  
    	    while(itr.hasNext()){  
    	        //Converting to Map.Entry so that we can get key and value separately  
    	        Map.Entry entry=(Map.Entry)itr.next();  
    	        System.out.println(entry.getKey()+" "+entry.getValue());  
    	}  
            
	}
}
