package day_7packag;

import java.util.HashMap;

public class Equalsmthd {
	public static void main(String[] args) throws CloneNotSupportedException 
    {
        HashMap<Integer, String> map1 = new HashMap<>();
 
        map1.put(1, "P");
        map1.put(2, "Q");
        map1.put(3, "R");
        HashMap<Integer, String> map2 = new HashMap<>();
 
        map2.put(3, "R");
        map2.put(1, "P");
        map2.put(2, "Q");
        HashMap<Integer, String> map3 = new HashMap<>();
 
        map3.put(1, "P");
        map3.put(2, "Q");
        map3.put(3, "R");
        map3.put(3, "S");
         
        System.out.println(map1.equals(map2));  
        System.out.println(map1.equals(map3));  
    }
}
