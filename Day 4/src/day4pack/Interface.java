package day4pack;

public class Interface {

}
interface A
{
	void method1();
	void method2();
}
interface B extends A
{
	void method3();
}
class Eg implements B
{
	public void method1()
	{
		System.out.println(" method1 ");
	}
	public void method2()
	{
		System.out.println(" method2 ");
	}
	public void method3()
	{
		System.out.println(" method3 ");
	}
}
class Extend
{
	public static void main(String[] args)
	{
		Eg e=new Eg();
		e.method1();
		e.method2();
		e.method3();
	}
}
