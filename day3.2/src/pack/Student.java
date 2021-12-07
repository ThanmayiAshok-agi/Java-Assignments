package pack;

public class Student {
	 String ss;
	    String name;
	  public Student(String ss){
	      name = ss;
	  }
	  public Student()
	  {
	      name = "unknown";
	  }
	
	    public static void main(String[] args) {
	        Student obj = new Student();
	        obj.ss = "b";
	        System.out.println(obj.ss);
	        System.out.println(obj.name);

	    }
}
