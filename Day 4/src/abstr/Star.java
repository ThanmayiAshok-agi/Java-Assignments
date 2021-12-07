package abstr;

public class Star {
	public static void main(String[] args) {
	    int rows = 4;

	    for(int i = rows; i >= 1; i--) 
	    {
	      for(int l = 1; l <= rows - i; l++)
	      {
	        System.out.print("  ");
	      }

	      for(int j=i; j <= 2 * i - 1; j++)
	      {
	        System.out.print("* ");
	      }

	      for(int j = 0; j < i - 1; j++) 
	      {
	        System.out.print("* ");
	      }

	      System.out.println();
	    }
	  }
}
