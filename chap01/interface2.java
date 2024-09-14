abstract class Predator3 extends Animal {
    abstract String getFood();
}

interface Barkable3 {
    void bark();
}

class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger3 extends Predator3 implements Barkable3 {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion3 extends Predator3 implements Barkable3 {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper3 {
    void feed(Predator3 predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable3 animal) {
        animal.bark();
    }
}

public class interface2 {
    public static void main(String[] args) {
        Tiger3 tiger = new Tiger3();
        Lion3 lion = new Lion3();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}