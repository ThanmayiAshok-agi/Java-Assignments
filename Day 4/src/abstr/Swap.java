package abstr;

public class Swap {
	public static void main(String[] args) 
    {
        int temp;
        int x = 2;
        int y = 50;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + " and y = " + y);
    }
}
