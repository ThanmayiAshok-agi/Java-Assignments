package day6pack;

import java.util.ArrayList;

public class Addmethod {
	public static void main(String[] args) 
    {
        ArrayList<String> list1 = new ArrayList<>(); 
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4"); 
        ArrayList<String> list2 = new ArrayList<>(); 
        list2.add("5");
        list1.addAll(list2);
        System.out.println(list1);    
    }
}
