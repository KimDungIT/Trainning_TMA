package oop.encapsulation;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setName("Eagle");
        animal.setAverageWeight(1.5);
        animal.setNumberOfLegs(2);

        System.out.println("Name: " + animal.getName());
        System.out.println("Average Weight: " + animal.getAverageWeight());
        System.out.println("Number of legs: " + animal.getNumberOfLegs());
    }
}
