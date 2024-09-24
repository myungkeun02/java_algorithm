package 문법.생성자;

class Animal2 {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog2 extends Animal2 {
    void sleep() {
        System.out.println(this.name + "zzz");
    }
}

class HouseDog2 extends Dog2 {
    HouseDog2(String name) {  // constructor
        this.setName(name);
    }

    HouseDog2(int type) { // constructor over loading
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    void sleep() {
        System.out.println(this.name + "zzz in house");
    }
    void sleep(int hour) {
        System.out.println(this.name + "zzz in house" + hour + "hours");
    }
}

public class Constructor {
    public static void main(String[] args) {
        HouseDog2 houseDog = new HouseDog2("Happy"); // 인스턴스 생성과 동시에 인자로 전달
        System.out.println(houseDog.name);
        HouseDog2 houseDog2 = new HouseDog2(1); // over loading 된 constructor
        System.out.println(houseDog2.name);
        HouseDog2 houseDog3 = new HouseDog2(2);
        System.out.println(houseDog3.name);
    }
}
// 만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 이와 같은 디폴트 생성자를 추가한다. 하지만 사용자가 작성한 생성자가 하나라도 구현되어 있다면 컴파일러는 디폴트 생성자를 추가하지 않는다.