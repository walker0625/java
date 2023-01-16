package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("bnn");
        names.add("cnn");
        names.add("ann");

        List<String> collectedList = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        names.parallelStream().map(String::toUpperCase).forEach(System.out::println);
    }

}
