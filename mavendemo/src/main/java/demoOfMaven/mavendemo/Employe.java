package demoOfMaven.mavendemo;

public class Employe {
	String name,id,salary,address;

	public Employe() {
	}
	public Employe(String name,String id,String salary,String address) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.address=address;
	}
	void display()
	{
		System.out.println("Name:"+name+" Id:"+id+" Salary:"+salary+" Address:"+address);
	}
}
