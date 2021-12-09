package day6pack;

import java.util.ArrayList;

public class Removeall {
	public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("P");
        name.add("Q");
        name.add("R");
        System.out.println("This is for Removeall method = " + name);
        name.removeAll(name);
        System.out.println("ArrayList after removeAll() =  " + name);
    }
}
