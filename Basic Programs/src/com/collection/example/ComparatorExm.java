package com.collection.example;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

class RealMadrid implements Comparable<RealMadrid>
{
    private String name;
    private String place;
    private int height;
	@Override
	
	public int compareTo(RealMadrid R) {
		return this.height-R.height;
	}
     public RealMadrid(String n,String p,int h){
			this.name=n;
			this.place=p;
			this.height=h;
	}
	public String getName() {
		return name;
	}
	public String getPlace() {
		return place;
	}
	public int getHeight() {
		return height;
	}	 
}
class NameCompare1 implements Comparator<RealMadrid>
{

	public int compare(RealMadrid o1, RealMadrid o2) {
	
		return o1.getName().compareTo(o2.getName());
	}
	
}
class HeightCompare implements Comparator<RealMadrid>
{

	@Override
	public int compare(RealMadrid o1, RealMadrid o2) {
		if(o1.getHeight() >o2.getHeight()) return -1;
		else return 0;
		
	}
	
}
public class ComparatorExm {
   
	public static void main(String[] args) {
		ArrayList<RealMadrid> list = new ArrayList<RealMadrid>();
		list.add(new RealMadrid("James","Midfield", 6));
		list.add(new RealMadrid("Bale","Midfield", 7));
		list.add(new RealMadrid("Ronaldo","Midfield", 8));
		list.add(new RealMadrid("Ramos","Midfield", 9));
		
		System.out.println("sorting by using names");
		NameCompare1 nm=new NameCompare1();
		Collections.sort(list,nm);
		for(RealMadrid r:list)
		{
			System.out.println(r.getName()+" "+r.getHeight()+" "+r.getPlace());
		}
		System.out.println("\nsorting by using height");
		HeightCompare h = new HeightCompare();
		Collections.sort(list,h);
		for(RealMadrid r:list){
			System.out.println(r.getHeight()+" "+r.getName()+" "+r.getPlace());
		}
		
		
	}
}
