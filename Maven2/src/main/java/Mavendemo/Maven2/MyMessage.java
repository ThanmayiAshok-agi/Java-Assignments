package Mavendemo.Maven2;

import org.springframework.stereotype.Component;

@Component
public class MyMessage {

	public MyMessage() 
	{
		System.out.println("Inside constructor...");
	}
	void display()
	{
		System.out.println("Inside Method...");
	}
}