package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsTest {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);

        return c;
    }

    public static void main(String[] args) {

        ThrowsTest test = new ThrowsTest();

        try {
            test.loadClass("a.txt", "abc");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("after error");
    }

}
