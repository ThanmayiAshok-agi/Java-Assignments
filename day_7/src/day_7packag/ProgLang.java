package day_7packag;

import java.util.HashMap;
import java.util.Map;

public class ProgLang {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("Java","79");
		map.put("Php","60");
		map.put("Android","90");
		for(Map.Entry<String,String> me:map.entrySet())
		{
			System.out.println(me.getKey() +" : "+me.getValue());
		}
	}
}
