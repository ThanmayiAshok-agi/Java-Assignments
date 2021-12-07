package pack2;

public class Egofin {
	public class Test {
        
	    public void main(String args[])
	    {
	             B b=new B();
	        b.display();
	        b.show();
	        b.details();
	}    
	}

	 

	class A   
	{

	 void display()
	{
	System.out.print("PARENT DISPLAY ");
	}

	 

	void show()
	{
	    System.out.print("PARENT SHOW METHOD ");
	}
	}

	 

	class B   extends A    //child or subclass
	{
	void details()
	{
	    System.out.print("B Details METHOD ");
	}
	}
}
