package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;

//A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
 private double rating;
 private String name;
 private int year;

 // Used to sort movies by year
 public int compareTo(Movie m)
 {
     return this.year - m.year;
 }

 // Constructor
 public Movie(String nm, double rt, int yr)
 {
     this.name = nm;
     this.rating = rt;
     this.year = yr;
 }

 // Getter methods for accessing private data
 public double getRating() { return rating; }
 public String getName()   {  return name; }
 public int getYear()      {  return year;  }
}


//Driver class
class ExampleComparable
{
 public static void main(String[] args)
 {
     ArrayList<Movie> list = new ArrayList<Movie>();
     list.add(new Movie("Mugulunage", 8.3, 2015));
     list.add(new Movie("Rajkumara", 8.7, 1977));
     list.add(new Movie("Dunkrik", 8.8, 1980));
     list.add(new Movie("OMK", 8.4, 1983));

     Collections.sort(list);

     System.out.println("Movies after sorting : ");
     for (Movie movie: list)
     {
         System.out.println(movie.getName() + " " +
                            movie.getRating() + " " +
                            movie.getYear());
     }
 }
}