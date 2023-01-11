package anonymous;

class Outer {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {

        int num = 10;

        //익명으로 사용해도 문제가 없음
        //class MyRunnable implements Runnable {
        return new Runnable() {

            int localNum = 1000;

            @Override
            public void run() {
                // 내부에서 변수 변경이 불가(final로 compile됨 - 상수화)
                System.out.println(i);
                System.out.println(num);
                System.out.println(localNum);
                System.out.println(outNum);
                System.out.println(sNum);
            }
        };

        //return new MyRunnable();
    }
}

public class AnonumousInnerClass {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getRunnable(100).run();
    }

}
