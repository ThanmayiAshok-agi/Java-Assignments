package day_7packag;

import java.util.HashMap;

public class Sizemthd {
	public static void main(String[] args)
    {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Welcome");
        hash_map.put(2, "to");
        hash_map.put(3, "Java");
        System.out.println("Mappings are " + hash_map);
        System.out.println("The size of the map is " + hash_map.size());
    }
}