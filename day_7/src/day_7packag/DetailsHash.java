package day_7packag;

import java.util.HashMap;
import java.util.Map;

public class DetailsHash {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("1","abc");
		map.put("2","pqr");
		map.put("3","xyz");
		map.put("4","mnp");
		for(Map.Entry<String,String> me:map.entrySet())
		{
			System.out.println(me.getKey() +" : "+me.getValue());
		}
	}
}
