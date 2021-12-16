package Day8_pack;

import java.util.Arrays;
import java.util.List;

public class countmthd {
	public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Hi", "My", "name", "is",
                                          "a", "b");
        long total = list.stream().distinct().count();
        System.out.println(total);
    }
}
