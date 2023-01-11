package compare;

import compare.Member;
import compare.MyCompare;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member(1, "test1"));
        memberList.add(new Member(3, "test3"));
        memberList.add(new Member(2, "test2"));

        Collections.sort(memberList);

        System.out.println(memberList);

        TreeSet<String> nameList = new TreeSet<>(new MyCompare());
        nameList.add("가");
        nameList.add("다");
        nameList.add("나");

        System.out.println(nameList);
    }

}
