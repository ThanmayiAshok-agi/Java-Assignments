package Sum;

public class Sumprog {
	public static void main(String[] args) {
		int sum = 0;
		Sumprog s= new Sumprog();
		s.Sumprog1(0);
	}
	public static int Sumprog1(int sum) {
        int num =50;
		for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }

        System.out.println("Sum = " + sum);
        return sum;
    }
}
