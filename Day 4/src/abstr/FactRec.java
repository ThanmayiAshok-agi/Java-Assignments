package abstr;

public class FactRec {
	public static void main(String[] args) {
        int n = 3;
        long factorial = FactNum(n);
        System.out.println("Factorial of " + n + " is " + factorial);
    }
    public static long FactNum(int n)
    {
        if (n >= 1)
            return n * FactNum(n - 1);
        else
            return 1;
    }
}
