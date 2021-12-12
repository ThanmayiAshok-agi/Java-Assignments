package day_7packag;

import java.util.HashMap;

public class PutAlmthd {
	public static void main(String[] args){
	    HashMap<String, Integer> Numbers = new HashMap<>();
	    Numbers.put("Two", 2);
	    Numbers.put("Three", 3);
	    System.out.println("The Numbers are " + Numbers);
	    HashMap<String, Integer> numbers = new HashMap<>();
	    numbers.put("One", 1);
	    numbers.putAll(Numbers);
	    System.out.println("Updated Numbers are " + numbers);
	  }
}