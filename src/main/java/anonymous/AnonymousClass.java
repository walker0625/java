package anonymous;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new MyEventHandler()); // 아래의 클래스를 선언하고 객체를 만들어서 사용(MyEventHandler라는 이름은 사실 불필요)
        
        b.addActionListener(new ActionListener() { // 클래스의 정의와 객체 생성을 동시에(부모나 조상클래스를 구현하며 바로 생성)
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("action!");
            }
        });

    }

}

class MyEventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("action!");
    }
}
