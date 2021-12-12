package day_7packag;

import java.util.ArrayList;
import java.util.List;

public class Arrlist {
	public static void main(String[] args) {
        List<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Blue");
        list1.add("Black");
        listOfLists.add(list1);
 
        ArrayList<String> List2 = new ArrayList<String>();
 
        List2.add("Red");
        List2.add("Yellow");
        listOfLists.add(List2);
 
        listOfLists.forEach((list)  -> 
        {
            list.forEach((colour)->System.out.println(colour));
        }
                );
	}
}
