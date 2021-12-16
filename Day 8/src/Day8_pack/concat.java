package Day8_pack;

import java.util.stream.Stream;

public class concat {
	public static void main(String[] args)
    {
        Stream<String> stream1 = Stream.of("A", "B");
        Stream<String> stream2 = Stream.of("C", "D");
        Stream.concat(stream1, stream2)
            .forEach(element -> System.out.println(element));
    }
}
