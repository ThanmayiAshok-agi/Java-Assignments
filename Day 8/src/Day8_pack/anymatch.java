package Day8_pack;

import java.util.stream.Stream;

public class anymatch {
	public static void main(String[] args) 
    {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        boolean match = stream.anyMatch(s -> s.contains("four"));
        System.out.println(match);
    }
}
