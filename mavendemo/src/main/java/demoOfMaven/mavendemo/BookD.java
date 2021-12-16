package demoOfMaven.mavendemo;

public class BookD {
	String id,publisher,price;

	public BookD() {
	}
	public BookD(String id,String publisher,String price) {
		this.id=id;
		this.publisher=publisher;
		this.price=price;
	}
	void display()
	{
		System.out.println("Id:"+ id +" Publisher:"+publisher + " Price:"+price);
	}
}
