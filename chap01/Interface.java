// 인터페이스는 왜 필요한가

class AnimalInterface {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends AnimalInterface {
}

class Lion extends AnimalInterface {

}

class Zookeeper {
    void feed(Tiger tiger) {
        System.out.println("feed Apple");
    }
    void feed(Lion lion) {
        System.out.println("feed banana");
    }
}

public class Interface {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zookeeper.feed(tiger); // feed apple 출력
        zookeeper.feed(lion); // feed banana 출력
    }
}
 // 여기서 다른 동물이 추가된다면 Zookeeper 의 feed 매서드를 각각 다른 동물로 추가를 해줘야하는 번거러움이 있다.
// 이를 극복하기위해 interface 를 사용한다 interface2.class 로 넘어가보자