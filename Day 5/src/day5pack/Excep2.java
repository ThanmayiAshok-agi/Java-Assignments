package day5pack;

public class Excep2 {
	public static void main(String aa[])
    {
        try {
    String var=null;

    System.out.print(var.charAt(3));
    }

    catch(Exception e)
    {
        System.out.print(e);
    }
        finally {
        	System.out.println("Working");
        }
    }
}
