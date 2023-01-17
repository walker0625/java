package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

class Study {
    private String title;
    private String writer;

    public Study() {
    }

    public Study(String title) {
        this.title = title;
    }
    
    public Study(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Optional<String> getWriter() {
        return Optional.ofNullable(writer);
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Study{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}

public class OptionalTest {

    public static void main(String[] args) {
        List<Study> studyList = new ArrayList<>();
        studyList.add(new Study("java", "dev"));
        studyList.add(new Study("spring"));

        studyList.stream().map(s -> s.getWriter().orElseGet(()->"free"))
                          .collect(Collectors.toList()).forEach(System.out::println);

        String none = studyList.get(1).getWriter().orElseGet(() -> "none");
        Study noneWriterBook = Optional.ofNullable(studyList.get(2)).orElseGet(() -> new Study("noneWriter"));

        System.out.println(none);

        try {
            studyList.stream().filter(s -> s.getWriter().orElseThrow(NoSuchElementException::new).equals("dev"))
                              .forEach(System.out::println);
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
        }

        studyList.forEach(s -> {
            if(s.getWriter().isEmpty()) {
                s.setWriter("free");
            };
        });

        studyList.forEach(System.out::println);
    }

}