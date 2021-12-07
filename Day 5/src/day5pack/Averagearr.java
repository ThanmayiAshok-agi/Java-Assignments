package day5pack;

public class Averagearr {
	public static void main(String[] args) {
        int[] array = { 2,4,6,8 };
        int length = array.length;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / length;
        System.out.println("Average of array : "+average);
    }
}
