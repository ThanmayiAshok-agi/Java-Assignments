package day6pack;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String args[]) 
    {
    
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Php");
        list.add("Python");
        
        for(String x  : list)
        {
        System.out.println(x);    
        }
        
    }
}