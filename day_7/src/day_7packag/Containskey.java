package day_7packag;

import java.util.HashMap;

public class Containskey {
	public static void main(String[] args){
	    HashMap<String, String> details = new HashMap<>();
	    details.put("Name", "A");
	    details.put("Salary", "Rs 40,000");
	    details.put("Id", "005");
	    System.out.println(" Details: \n" + details);
	    if(details.containsKey("Id")) {
	      System.out.println("Id is present");
	    }
	  }
}
