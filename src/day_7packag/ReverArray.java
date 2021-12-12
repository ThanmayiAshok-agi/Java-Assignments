package day_7packag;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverArray {
	public static void main(String[] args)
    {
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(5);
        List.add(4);
        List.add(3);
        List.add(2);
        List.add(1);
        ListIterator<Integer> List_Iter= List.listIterator(List.size());
        System.out.println("Reversed List are : ");
        while (List_Iter.hasPrevious()) {
            System.out.println(List_Iter.previous());
        }
    }
}