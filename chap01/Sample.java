class Animal {
    String name;
    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + "zzz");
    }
}

public class Sample {
    public static void main(String[] args) {
        Animal cat = new Animal();// 새로운 객체(인스턴스) 생성
        cat.setName("Cat"); // 객체의 변수는 공유되지 않는다.
        String catName = cat.getName();
        System.out.println(cat.name); // "Cat"
        System.out.println(catName);

        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
