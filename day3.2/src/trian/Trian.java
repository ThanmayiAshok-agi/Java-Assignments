package trian;

import java.util.Scanner;

public class Trian {
	int l,b,h;
	Trian(){
	System.out.println("Enter the sides of triangle");
	Scanner s=new Scanner(System.in);
	l=s.nextInt();
	b=s.nextInt();
	h=s.nextInt();
	int p=l+b+h;
	int s2=p/2;
	double sq =(s2*(s2-l)*(s2-b)*(s2-h));
	double area=Math.sqrt(sq);
	System.out.println("Area is: "+area+" Perimeter is: "+p);
	}
}
