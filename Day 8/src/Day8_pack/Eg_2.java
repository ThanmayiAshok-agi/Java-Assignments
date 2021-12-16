package Day8_pack;

import java.util.ArrayList;

public class Eg_2 {
	public static void main(String aa[]) 
    {
        ArrayList<String> list=new ArrayList<>();
        
        list.add("abcd");
        
        list.add("abcd");
        
        list.add("abcd");
        
        list.add("abcd");
        
        list.add("abcd");
        list.forEach(
                (String n)->System.out.println(n));
    }
}
