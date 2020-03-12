package oop.abstraction.interfaces;

public class EagleTest {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();

        eagle.eat();
        eagle.sound();
        eagle.fly();

        System.out.println("Number of legs: " + Bird.numberOfLegs);
        System.out.println("Outer covering: "+ Bird.outerCovering);
        eagle.printInfo();
    }
}
