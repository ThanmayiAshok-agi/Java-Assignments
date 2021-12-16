package demoOfMaven.mavendemo;

public class Student {
	String name,roll;

	
	
	public Student() {
	}
	public Student(String name,String roll) {
		this.name=name;
		this.roll=roll;
	}
	void display()
	{
		System.out.println("Name :"+name+" Rollno:"+roll);
	}
}
