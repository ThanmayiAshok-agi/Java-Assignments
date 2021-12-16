package Mavendemo.Maven2;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired
	MyAddress add;

	public MyAddress getAdd() {
		return add;
	}

	public void setAdd(MyAddress add) {
		this.add = add;
	}
	void displayadd()
	{
		add.display();
	}
}