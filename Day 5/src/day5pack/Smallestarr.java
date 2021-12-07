package day5pack;

public class Smallestarr {
	public static void main(String args[]){
	      int temp, size;
	      int array[] = {100, 45, 95, 64, 11, 38};
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
	      System.out.println("Smallest element of the array is "+array[0]);
	   }
}
