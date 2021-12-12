package day_7packag;

import java.util.HashMap;
import java.util.Map;

public class Employ {
	public static void main(String[] args) {
		HashMap<String,Employee> map = new HashMap<>();
		System.out.println("---Employee Details---");
		Employee e1 =new Employee(" jai " ,  " Rs 40,000 ", " 201 ");
		Employee e2 =new Employee(" sia " ,  " Rs 32,000 ", " 202 ");
		Employee e3 =new Employee(" arti " , " Rs 60,000 ", " 203 ");
		map.put("Employee1", e1);
		map.put("Employee2",e2);
		map.put("Employee3",e3);
		for(Map.Entry<String,Employee> me:map.entrySet())
		{
			System.out.println(me.getKey() +" : "+me.getValue().name+" "+me.getValue().salary+" "+me.getValue().id);
		}
	}
}
	class Employee
	{
		String name,salary,id;
		public Employee(String name,String salary,String id) {
			super();
			this.name=name;
			this.salary=salary;
			this.id=id;
		}
}
