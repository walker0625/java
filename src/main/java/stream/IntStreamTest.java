package stream;

import java.util.Arrays;

public class IntStreamTest {

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};

        // 1. Arrays.stream(arr)으로 생성된 IntStream은 재사용이 불가 2. 원 data인 arr은 영향을 받지 않음
        // (error : stream has already been operated upon or closed)
        Arrays.stream(arr).forEach(i -> System.out.println(i));

        System.out.println(Arrays.stream(arr).sum());
    }

}
