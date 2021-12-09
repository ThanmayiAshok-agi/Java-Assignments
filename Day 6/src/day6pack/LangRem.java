package day6pack;

import java.util.ArrayList;

public class LangRem { 
        public static void main(String[] args) {
                ArrayList<String> lang = new ArrayList<>();
                lang.add("Java");
                lang.add("C");
                lang.add("Python");
                lang.add("C++");
                lang.add("Javascript");
 
                System.out.println("Array elements : " + lang);
                lang.remove("C");
                System.out.println("ArrayList elements after removing : " + lang);
        }
}
