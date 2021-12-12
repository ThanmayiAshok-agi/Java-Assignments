package day_7packag;

import java.util.HashMap;
import java.util.Map;

public class TeacherHash {
	public static void main(String[] args) {
		HashMap<String,Teacher> map = new HashMap<>();
		Teacher t1 =new Teacher(" siri " , " 3 " ," 300 ");
		Teacher t2 =new Teacher(" ankit ", " 4 " ," 301 ");
		Teacher t3 =new Teacher(" ajay " , " 5 " ," 302 ");
		map.put("Teacher1", t1);
		map.put("Teacher2",t2);
		map.put("Teacher3",t3);
		for(Map.Entry<String,Teacher> me:map.entrySet())
		{
			System.out.println(me.getKey() +" : "+me.getValue().name+" "+me.getValue().id+" "+me.getValue().Class);
		}
	}
}
	class Teacher
	{
		String name,id,Class;
		public Teacher(String name,String id,String Class) {
			super();
			this.name=name;
			this.id=id;
			this.Class=Class;
		}
}
