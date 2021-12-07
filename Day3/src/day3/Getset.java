package day3;

public class Getset {
	String name,rollno;
	   
void setName(String name)
	{
	    this.name=name;
	}
void setRollno(String rollno)
	{
	    this.rollno=rollno;    
	}
String getName()
	{
	    return name;
	}
String getRollno()
	{
	    return rollno;
	}
public static void main(String aa[])
{
     Getset t1=new Getset();
      t1.setName("a");
      t1.setRollno("20");
     
      System.out.print(t1.getName()+"  "+t1.getRollno());
}
}
