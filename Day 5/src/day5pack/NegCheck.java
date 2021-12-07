package day5pack;

import java.io.*;
public class NegCheck {

}
class CheckNeg extends Exception
{
	CheckNeg(String message)
	{
		super(message);
	}
}
class CheckNeg2
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try
		{
			System.out.println ("Enter any number");
			n=Integer.parseInt(br.readLine());
			if(n<0)
			{
				System.out.println ("Number is negative");
			}
			else
			{
				throw new myException("Number is not negative");
			}
		}
		catch(myException ex)
	    {
			System.out.println (ex);
		}
		catch(IOException ix)
		{
			System.out.println (ix);
		}
		
	}
}
