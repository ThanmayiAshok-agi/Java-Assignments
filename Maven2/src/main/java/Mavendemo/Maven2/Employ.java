package Mavendemo.Maven2;

import org.springframework.beans.factory.annotation.Autowired;

public class Employ {

	@Autowired
	MySalary sal;

	public MySalary getSal() {
		return sal;
	}

	public void setSal(MySalary sal) {
		this.sal = sal;
	}
	void displaysal()
	{
		sal.display();
	}
}
