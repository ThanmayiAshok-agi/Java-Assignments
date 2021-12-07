package summethod;

import java.util.*;

public class Summeth {
	void sum(int x, int y) 
	   { 
	     int p = x + y; 
	     System.out.println("Sum of two numbers: " +p); 
	   } 
	   void sum(int x, int y, int z) 
	   { 
	     int q = x + y + z; 
	     System.out.println("Sum of three numbers: " +q); 
	   } 
	public static void main(String[] args) 
	{ 
	   Summeth a = new Summeth(); 
	    a.sum(2, 3);  
	    a.sum(4, 6, 8);  
	  } 
	 }