package serialrize;

import java.io.*;

class Person implements Serializable { // marker interface로 직렬화 가능하다는 것을 알려주는 역할만 함

    String name;
    transient String job; // 직렬화에서 제외할 필드에 표시(역직렬화시 null로 남음)

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

}


public class SerializationTest {

    public static void main(String[] args) {
        Person lee= new Person("lee", "ceo");
        Person kim= new Person("kim", "dev");

        try (FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream ois = new ObjectOutputStream(fos)){

            ois.writeObject(lee);
            ois.writeObject(kim);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fos = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fos)){

            Person leeR = (Person) ois.readObject();
            Person kimR = (Person) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }


    }

}
