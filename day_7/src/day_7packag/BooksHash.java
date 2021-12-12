package day_7packag;

import java.util.HashMap;
import java.util.Map;

public class BooksHash {
	public static void main(String[] args) {
		HashMap<String,Book> map = new HashMap<>();
		Book b1 =new Book("Booka", "001"," Rs 200");
		Book b2 =new Book("Bookb", "002"," Rs 150");
		Book b3 =new Book("Bookc", "003"," Rs 300");
		map.put("Book1", b1);
		map.put("Book2",b2);
		map.put("Book3",b3);
		for(Map.Entry<String,Book> me:map.entrySet())
		{
			System.out.println(me.getKey() +" Name: "+me.getValue().name+" Id: "+me.getValue().id+" Price:"+me.getValue().price);
		}
	}
}
	class Book
	{
		String name,id,price;
		public Book(String name,String id,String price) {
			super();
			this.name=name;
			this.id=id;
			this.price=price;
		}
	}