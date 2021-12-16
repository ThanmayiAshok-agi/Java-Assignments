package Day8_pack;

import java.util.stream.Stream;

public class emptymthd {
	public static void main(String[] args)
    {
        Stream<String> stream = Stream.empty();
        stream.forEach(System.out::println);
    }
}
