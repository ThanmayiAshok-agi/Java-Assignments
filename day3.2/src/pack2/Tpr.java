package pack2;

public class Tpr {
	public int p;
	int q;
	int r;
	public double getArea() {
		double s=(p+q+r)/2.0;
		return Math.pow((s*(s-p*(s-q)*(s-r))), .5);
	}
	public double getPerimeter() {
		return(p+q+r)/2.0;
	}
}
class Ap{
	public static void main(String[] args) {
		Tpr t=new Tpr();
		t.p=2;
		t.q=5;
		t.r=6;
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
	}
}

