package Day8_pack;

public class stream {
	public static void main(String args[]) 
    {
       
        cal c= (int x,int y) -> 
        {
            int z=x+y;
            return z;
        };
        
        
        System.out.println(c.add(2,4));
        }
    }

 interface cal
{
    int add(int a,int b);
}