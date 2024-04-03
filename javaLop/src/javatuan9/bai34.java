package javatuan9;

interface GenericBehavior {
    void eat();
    void sound();
}

interface Swim {
    void swim();
}

interface Fly {
    void fly();
}

class Dog implements GenericBehavior {
    public void eat() {
        System.out.println("Dog eat with Dũn .");
    }
    public void sound() {
        System.out.println("dog sound.");
    }
    public void swim(){
        System.out.println("Dog swim with Dũn. ");
    }
}

class Fish implements GenericBehavior, Swim {
    public void eat() {
        System.out.println("Fish eat");
    }
    public void sound() {
        System.out.println("fish is flying . ");
    }
    public void swim() {
        System.out.println("Fish is walking ");
    }
}

class Bird implements GenericBehavior, Fly {
    public void eat() {
        System.out.println("Bird eat");
    }
    public void sound() {
        System.out.println("chip chip");
    }
    public void fly() {
        System.out.println("Bird is swimming");
    }
}

class Bat implements GenericBehavior, Fly {
    public void eat() {
        System.out.println("Bat eat");
    }
    public void sound() {
        System.out.println("sound: chiu chiu");
    }
    public void fly() {
        System.out.println("Bat fly");
    }
}

public class bai34  {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(" Dog:");
        dog.eat();
        dog.sound();
        dog.swim();

        Fish fish = new Fish();
        System.out.println("\n Fish:");
        fish.eat();
        fish.sound();
        fish.swim();

        Bird bird = new Bird();
        System.out.println("\n Bird:");
        bird.eat();
        bird.sound();
        bird.fly();

        Bat bat = new Bat();
        System.out.println("\n Bat:");
        bat.eat();
        bat.sound();
        bat.fly();
    }
}

