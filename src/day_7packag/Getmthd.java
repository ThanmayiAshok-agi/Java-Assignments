package day_7packag;

import java.util.HashMap;

public class Getmthd {
	public static void main(String[] args)
    {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(5, "A");
        hash_map.put(10, "B");
        hash_map.put(15, "C");
        hash_map.put(20, "D");
        hash_map.put(25, "E");
        System.out.println("The values are : " + hash_map);
        System.out.println("The Value is: " + hash_map.get(5));
        System.out.println("The Value is: " + hash_map.get(20));
    }
}
