package day6pack;

import java.util.ArrayList;

public class Languages {
	public static void main(String args[]) 
    {
        ArrayList<Lang> list=new ArrayList<>();
        Lang l1=new Lang("Java", "9");
        Lang l2=new Lang("Android", "8");
        Lang l3=new Lang("C Prog", "8");    
        Lang l4=new Lang("Python", "9");
        
          list.add(l1);
          list.add(l2);
          list.add(l3);
          list.add(l4);
          for( Lang l:list)
          {
              System.out.println(l.name+"  "+l.rating);
          }
    }
}
class Lang
{
    String name;
    String rating;
    public Lang(String name, String rating) {
        super();
        this.name = name;
        this.rating = rating;
    }    
}
