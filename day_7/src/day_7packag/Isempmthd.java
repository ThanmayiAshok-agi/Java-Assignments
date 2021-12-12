package day_7packag;

import java.util.HashMap;

public class Isempmthd {
	public static void main(String[] args)
    {
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        hash_map.put("Hello", 5);
        hash_map.put("This", 10);
        hash_map.put("Is", 15);
        System.out.println("The Mappings are: " + hash_map);
        System.out.println("Is List empty :" + hash_map.isEmpty());
    }
}