package day6pack;

import java.util.ArrayList;

public class Arraylist4 {
	public static void main(String args[]) 
    {
        ArrayList<Stud1> list=new ArrayList<>();
        Stud1 s1=new Stud1("p", "Present");
        Stud1 s2=new Stud1("q", "Absent");
        Stud1 s3=new Stud1("r", "Present");    
        Stud1 s4=new Stud1("s", "Present");
        
          list.add(s1);
          list.add(s2);
          list.add(s3);
          list.add(s4);
          for( Stud1 s:list)
          {
              System.out.println(s.name+"  "+s.attendence);
          }
    }
}
class Stud1
{
    String name;
    String attendence;
    public Stud1(String name, String attendence) {
        super();
        this.name = name;
        this.attendence = attendence;
    }    
}
