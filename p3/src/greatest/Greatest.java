package greatest;

public class Greatest {
	public static void main(String[] args) {

        int n1 = 4, n2 = 10, n3 = 2;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the greatest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the greatest number.");

        else
            System.out.println(n3 + " is the greatest number.");
    }
}
