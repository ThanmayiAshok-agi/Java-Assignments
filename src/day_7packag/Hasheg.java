package day_7packag;

import java.util.HashMap;
import java.util.*;
public class Hasheg {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("key1","abc");
		map.put("key2","pqr");
		map.put("key3","xyz");
		for(Map.Entry<String,String> me:map.entrySet())
		{
			System.out.println(me.getKey() +" and "+me.getValue());
		}
	}
}
