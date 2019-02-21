package collection;

import java.util.Arrays;
import java.util.*;


public class StringExample {
  public static void main(String[] args){
	 
	String values="abc,def,ghi,jkl";
	String[] val=values.split("[,]");
    for(int i=0;i<val.length;i++) {
    	System.out.println(val[i]);
    }
	  
      String string="anand,kumar,antione,grizman";
      String c= string.toCharArray().toString();
      System.out.println(c);
	  
	  String[] val1=null;
	  String values1="a b c:d e f:g h i:j k l";
	 
	  List<String> list = null;
	  for(int i=0;i<3;i++) {
		  val1=values1.split(":");		   
		  list=Arrays.asList(val1);		
	}
	System.out.println(list);
  
	
  }
}
