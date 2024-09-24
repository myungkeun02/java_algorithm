package 문법;

class Counter {
    static int count = 0;
    final static int lastNumber = 10;
    // static 을 사용하는 이유는 크게 두가지 이다.
    // 우선 static을 사용하지 않고 Couter 클래스를 만들고 객체를 생성하면 lastNumber 값이 매번 다른 메모리에 할당이 된다.
    // 하지만 lastNumber 값은 항상 고정 되어 있기 떄문에 매번 메모리르 할당한다면 이는 메모리에 큰 손해가 발생한다.
    // 이때 static 키워드를 사용하면 매번 객체를 생성하더라도 같은 메모리에 할당된 lastNumber를 가져오기에 메모리 관리 차원에서 좋다.
    // 두번째 이유는 같은 메모리에 값이 저장되어 있기 때문에 값을 공유한다는 것이다.
    Counter() {
        count++;
        System.out.println(count);
    }
    public static int getCount() {
        return count;
    }
}

public class Static {
    public static void main(String[] args) {
        Counter c1 = new Counter(); // 객체를 호출 할때마다 count의 값이 1 씩 오르게 된다.
        Counter c2 = new Counter();

        System.out.println(Counter.getCount());
    }
}

// 만약 위 lastNumber 처럼 변하지 않는 값은 상수로 지정하는것이 좋다 이떄는 final 키워드를 붙이면 된다.