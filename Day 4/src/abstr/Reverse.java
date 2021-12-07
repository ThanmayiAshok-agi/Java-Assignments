package abstr;

public class Reverse {
	public static void main(String[] args) {    
        String name = "Hello";    
      String RevStr = "";            
        for(int i = name.length()-1; i >= 0; i--)
        {    
            RevStr = RevStr + name.charAt(i);    
        }       
        System.out.println("Original string is " + name);    
        System.out.println("Reverse of string is " + RevStr);    
    }    
}    
