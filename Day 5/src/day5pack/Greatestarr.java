package day5pack;

public class Greatestarr {
	public static void main(String args[]){
	      int temp, size;
	      int array[] = {2, 4, 6, 8, 10};
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Greatest element is "+array[size-1]);
	   }
}
