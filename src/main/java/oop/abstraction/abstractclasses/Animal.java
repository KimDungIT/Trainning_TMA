package oop.abstraction.abstractclasses;

public abstract class Animal {

    abstract void move();
    abstract void eat();

    public void label() {
        System.out.println("Animal's data: ");
    }
}
