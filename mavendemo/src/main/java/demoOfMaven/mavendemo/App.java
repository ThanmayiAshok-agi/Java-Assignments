package demoOfMaven.mavendemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("MyBeans.xml");
		// TODO Auto-generated method stub
Student s= (Student)context.getBean("s1");
s.display();
Employe e =(Employe)context.getBean("e1");
e.display();
BookD b =(BookD)context.getBean("b1");
b.display();
    }
}
