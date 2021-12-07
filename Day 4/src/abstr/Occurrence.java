package abstr;

public class Occurrence {
	public static void main(String[] args){
		String strn = "Thanmayi";
		int count = 0;
	    for (int i=0; i < strn.length(); i++)
	    {
	        if (strn.charAt(i) == 'a')
	        {
	             count++;
	        }
	    }
		System.out.println("Occurrence of the character a is "+count);
	}
}
