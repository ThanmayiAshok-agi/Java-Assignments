package egp;

public class Egp {
	public static void main (String args[]){
		int calls=290;
		if(calls<=100)
		{
		System.out.println("Bill : Rs 0");
		}
		else if(calls>100 && calls<=200)
		{
		calls=calls-100;
		System.out.println(calls);
		}
		else if(calls>200 && calls<=300)
		{
		calls=(calls-200)*2+100;
		System.out.println(calls);
		}
		else {
		calls=(calls-300)*3+300;
		System.out.println(calls);
		}
	}
}
