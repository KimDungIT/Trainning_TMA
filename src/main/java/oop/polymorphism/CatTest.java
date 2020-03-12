package oop.polymorphism;

public class CatTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Cat cat = new Cat();
        cat.eat();
    }
}
