package fib;

public class Fib {
	public static void main(String[] args) {

        int count = 20, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int Sum = num1 + num2;
            num1 = num2;
            num2 = Sum;
            i++;
        }
    }
}
