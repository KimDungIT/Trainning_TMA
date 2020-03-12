package oop.abstraction.interfaces;

public interface Animal {
    public void eat();
    public void sound();

    default void printInfo() {
        System.out.println("Print info");
    }
}
