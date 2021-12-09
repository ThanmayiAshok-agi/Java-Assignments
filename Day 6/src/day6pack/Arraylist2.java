package day6pack;

import java.util.ArrayList;

public class Arraylist2 {
	public static void main(String args[]) 
    {
    
        ArrayList<Integer> list=new ArrayList<>();
        list.add(200);
        list.add(400);
        list.add(600);
        
        for(int  x  : list)
        {
        System.out.println(x);    
        }
        
    }
}
