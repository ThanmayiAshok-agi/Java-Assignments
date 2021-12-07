package day5pack;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenPr {
}
	class myException extends Exception
	{
		myException(String message)
		{
			super(message);
		}
	}
	class q12Exception
	{
		public static void main(String args[])
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n;
			try
			{
				System.out.println ("Enter a number");
				n=Integer.parseInt(br.readLine());
				if(n%2==0)
				{
					System.out.println ("Number is even");
				}
				else
				{
					throw new myException("Number is not even");
				}
			}
			catch(myException e)
			{
				System.out.println (e);
			}
			catch(IOException i)
			{
				System.out.println (i);
			}
			
		}
}
