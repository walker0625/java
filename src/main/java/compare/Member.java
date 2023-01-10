package compare;

import lombok.Data;

@Data
public class Member implements Comparable<Member>{

    private int id;
    private String name;

    public Member() {
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Member member) {
        return this.id - member.id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
