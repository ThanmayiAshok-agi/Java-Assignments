package day6pack;

import java.util.ArrayList;

public class StudenMarks {
	public static void main(String args[]) 
    {
        ArrayList<Smarks> list=new ArrayList<>();
        Smarks s1=new Smarks("p", "400/500","380/500","312/500");
        Smarks s2=new Smarks("q", "299/500","340/500","456/500");
        Smarks s3=new Smarks("r", "346/500","412/500","267/500");    
        Smarks s4=new Smarks("s", "278/500","478/500","356/500");
        
          list.add(s1);
          list.add(s2);
          list.add(s3);
          list.add(s4);
          for( Smarks s:list)
          {
              System.out.println(s.name+"  "+s.marks1+" "+s.marks2+" "+s.marks3);
          }
    }
}
class Smarks
{
    String name;
    String marks1;
    String marks2;
    String marks3;
    public Smarks(String name, String marks1,String marks2,String marks3) {
        super();
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3=  marks3;
    }    
}

