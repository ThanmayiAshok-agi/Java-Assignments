package day_7packag;

import java.util.HashMap;
public class ClrMthod {
	public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("A", 1);
        numbers.put("B", 2);
        numbers.put("C", 3);
        System.out.println("HashMap: " + numbers);
        numbers.clear();
        System.out.println("HashMap after clear" + numbers);
    }
}
