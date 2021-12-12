package day_7packag;

import java.util.HashMap;

public class Replamthd {
	public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("X", 100);
        map.put("Y", 300);
        map.put("Z", 300);
        map.put("M", 400);
        System.out.println("The initial HashMap are  " + map.toString());
        map.replace("Y", 200);
        System.out.println("The New HashMap are " + map.toString());
    }
}
