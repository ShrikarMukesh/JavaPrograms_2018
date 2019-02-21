package com.example.json;

import java.util.*;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class JsonObjectintoList
{
  public static void main(String[] args) throws JSONException 
  {
	  JSONObject obj = new JSONObject();
	  List<String> sList = new ArrayList<String>();
	  sList.add("shrikar");
	  sList.add("shrikar");
      
	  obj.put("list", sList);
	  System.out.println(obj);
	  
  } 
	
}
