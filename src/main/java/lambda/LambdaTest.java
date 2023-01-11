package lambda;

public class LambdaTest {

    public static void main(String[] args) {

        // 1) add
        // Add addNum = (x,y) -> {return x +y;};
        //Add addNum = (x,y) -> x + y;
        Add addNum = Integer::sum;
        System.out.println(addNum.add(2,3));

        // 2) max
        Max max = (x,y) -> x > y ? x : y; // 람다식 구현
        System.out.println(max.getMax(10, 20)); // 람다식 사용

        // 3) normal
        String s1 = "hello";
        String s2 = "world";

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1, s2);

        // 4) lambda > 컴파일 과정에서 익명 객체를 만들어 생성
        StringConcat concat = (f, s) -> System.out.println(f + " " + s);
        concat.makeString(s1, s2);

        // 1. 구현 클래스(StringConcatImpl)를 따로 생성할 필요가 없음(일회용)
        // 2. 구현 방식을 간편하게 변경이 가능
        // 3. 함수를 변수(매개변수로 넘겨서 재사용 가능)처럼 사용가능
    }

}
