package day_7packag;

import java.util.ArrayList;
import java.util.Scanner;

public class Eop {
	public static void main(String args[]){
	       Scanner s = new Scanner(System.in);
	        ArrayList<Integer> p1 = new ArrayList<>();
	        ArrayList<Integer> even = new ArrayList<>();
	        ArrayList<Integer> odd = new ArrayList<>();
	        ArrayList<Integer> prime = new ArrayList<>();
	        int a;
	        System.out.println("Enter array elements"); 
	        for(int i = 1; i <=10;i++){
	        	a=s.nextInt();
	            p1.add(a);
	        }
	            System.out.println(p1);
	            int flag=0;
	            for(int l:p1) {
	            	if(l%2==0) {
	            		even.add(l);
	            	}
	            	else {
	            		odd.add(l);
	            		for(int i=2;i<=l/2;i++) {
	            			if(l%i==0) {
	            				flag=1;
	            				break;
	            			}
	            		}
	            		if(flag==0) {
	            			prime.add(l);
	            		}
	            	}
	            }
	            System.out.println("The even array list are :" +even);
	            System.out.println("The odd array list are :" +odd);
	            System.out.println("The prime array list are :" +prime);
}
}
