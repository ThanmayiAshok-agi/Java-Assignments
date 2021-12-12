package day_7packag;

import java.util.HashMap;
import java.util.Map;

public class ColorHash {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("color 1","red");
		map.put("color 2","black");
		map.put("color 3","pink");
		for(Map.Entry<String,String> me:map.entrySet())
		{
			System.out.println(me.getKey() +" : "+me.getValue());
		}
	}
}
