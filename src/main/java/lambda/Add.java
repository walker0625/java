package lambda;

@FunctionalInterface // 메소드를 2개 이상 선언해서는 안됨(뭘 구현해야 할지 모호해짐)
public interface Add {

    public int add(int x, int y);

}
