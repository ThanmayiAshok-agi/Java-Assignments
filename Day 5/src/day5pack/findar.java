package day5pack;

import java.util.Scanner;

public class findar {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the no of array");
	int n = s.nextInt();
	System.out.println("Enter "+n+" the characters");
	char ar[] = new char[n];
	for(int i=0;i<n;i++)
{
	ar[i]=s.next().charAt(0);
}
	int len =ar.length;
	for(int i=0;i<len;i++) {
		if (ar[i]=='a' |ar[i]=='e'|ar[i]=='i'|ar[i]=='o'|ar[i]=='u'|ar[i]=='A'|ar[i]=='E'|ar[i]=='I'|ar[i]=='O'|ar[i]=='U')
		{
			System.out.println("The vowels are ");
			System.out.println(ar[i]);
		}
	}
}
}
