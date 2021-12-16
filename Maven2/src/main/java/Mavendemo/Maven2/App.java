package Mavendemo.Maven2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
    	MessagePass pass = (MessagePass)context.getBean("msgpass");
    	pass.displaymsg();
    	Student s = (Student)context.getBean("addpass");
    	s.displayadd();
    	Employ e = (Employ)context.getBean("addsal");
    	e.displaysal();
    }
}
