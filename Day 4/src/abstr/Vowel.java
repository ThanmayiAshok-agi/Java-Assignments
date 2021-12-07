package abstr;

import java.util.Scanner;

public class Vowel {
	public static void main(String args[]){
	      int count = 0;
	      System.out.println("Enter characters :");
	      Scanner sc = new Scanner(System.in);
	      String character = sc.nextLine();

	      for (int i=0 ; i<character.length(); i++){
	         char ch = character.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels is "+count);
	   }
}
