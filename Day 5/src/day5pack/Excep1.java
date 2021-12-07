package day5pack;

public class Excep1 {
	public static void main(String aa[])
    {
    for(int i=1;i<=10;i++)
    {
        try {
        if(i==7)
        {
           i=i/0;
        }
        System.out.println(i);
        }
        catch(Exception e)
        {
            System.out.println("Exception in code : "+e);
        }

    }
    }
}
