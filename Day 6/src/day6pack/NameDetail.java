package day6pack;

import java.util.ArrayList;

public class NameDetail {
	public static void main(String args[]) 
    {
        ArrayList<FDetails> list=new ArrayList<>();
        System.out.println("--Details--");
        FDetails n1=new FDetails("ria", "9878967545","r");
        FDetails n2=new FDetails("sam", "8978985634","s");
        FDetails n3=new FDetails("jia", "8769453210","j");    
        FDetails n4=new FDetails("ankit", "9076786598","a");
        
          list.add(n1);
          list.add(n2);
          list.add(n3);
          list.add(n4);
          for( FDetails n:list)
          {
              System.out.println(n.name+"  "+n.contact+" "+n.nickname+" ");
          }
    }
}
class FDetails
{
    String name;
    String contact;
    String nickname;
    public FDetails(String name, String contact,String nickname) {
        super();
        this.name = name;
        this.contact = contact;
        this.nickname = nickname;
    }    
}
