package area;

import java.util.Scanner;

public class Area {
	    public static void main(String[] args)
	    {
	        Square c = new Square();
	        c.Area(4);
	        Circle b = new Circle();
	        b.Area(3);
	        Rectangle a = new Rectangle();
	        a.Area(2, 5);
	        
	    }
	}
	class Square 
	{
	    void Area(int side)
	    {
	        System.out.println("Area of the Square: "+side*side);
	    }
	}
	class Circle 
	{
	    static final double PI = Math.PI;
	    void Area(double r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("Area of circle is :" +A);
	    }
	}
	class Rectangle 
	{
	    void Area(int l, int b)
	    {
	        System.out.println("Area of rectangle: " + l*b);
	    }
	}