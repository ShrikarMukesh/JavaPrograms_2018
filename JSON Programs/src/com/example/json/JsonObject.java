package com.example.json;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


public class JsonObject {
    public static void main(String[] args) throws JSONException
    {
    	/*JSONObject jo = new JSONObject(); 	
    	jo.put("firstName", "John");
    	jo.put("lastName", "Doe");
  
    	System.out.println(jo);

    	JSONArray ja = new JSONArray();
    	ja.put(jo);
    	System.out.println(ja);

    	JSONObject mainObj = new JSONObject();
    	mainObj.put("employees", ja);
    	System.out.println(mainObj);*/
    	
    	JSONObject j = new JSONObject();
    	j.put("shrikar", "mukesh");
    	j.put("hi", "kumar");
    	System.out.println(j);
    	
    	JSONArray a=new JSONArray();
    	a.put(j);
    	System.out.println(a);
    	
    	JSONObject m= new JSONObject();
    	m.put("jjjjj", a);
    	System.out.println(m);
    	
    	
    	
    	
	}
}
