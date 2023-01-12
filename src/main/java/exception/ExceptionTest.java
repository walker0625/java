package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {

        // 1. basic
        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // Index 5 out of bounds for length 5
            System.out.println(e.toString()); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        }

        System.out.println("after error1");

        // 2. try - catch - resource
        try(FileInputStream fis = new FileInputStream("/null.txt")) {
            System.out.println("실행되지 않는 라인");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };

        System.out.println("after error2");

        // 3. Autocloseable
        try(AutoCloseableObj ac = new AutoCloseableObj()) {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("after error2");
    }

}
