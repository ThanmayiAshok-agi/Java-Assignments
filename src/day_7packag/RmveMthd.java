package day_7packag;

import java.util.HashMap;

public class RmveMthd {
	public static void main(String[] args){
	    HashMap<Integer, String> name = new HashMap<>();
	    name.put(1, "A");
	    name.put(2, "B");
	    name.put(3, "C");
	    System.out.println("Names: " + name);
	    name.remove(2);  
	    System.out.println("Updated Names: " + name);
	}
}
