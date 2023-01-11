package stream;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStream {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jacks");
        names.add("kaless");
        names.add("balesss");

        names.stream().sorted().forEach(s -> System.out.println(s)); // 기본 오름차
        names.stream().map(s -> s.length()).forEach(i -> System.out.println(i)); // System.out.println(s.length()) 이것이 불가 > map()으로 꺼내서 건내줌
    }

}
