package day_7packag;

import java.util.Arrays;
import java.util.List;

public class TravBac {
	public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(2,4,6,8,10);
        for (int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");       
    }
}