package day_7packag;

import java.util.HashMap;

public class Keysetmthd {
	public static void main(String[] args) {
	    HashMap<String, Integer> prices = new HashMap<>();
	    prices.put("Orange", 200);
	    prices.put("Mango", 300);
	    prices.put("Apple", 150);
	    System.out.println("HashMap: " + prices);
	    System.out.println("Keys: " + prices.keySet());
	  }
}
