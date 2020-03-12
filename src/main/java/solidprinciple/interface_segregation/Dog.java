package solidprinciple.interface_segregation;

public class Dog implements Animal {
    @Override
    public void Eat() {
        System.out.println("Dog eats fish");
    }

    @Override
    public void Drink() {
        System.out.println("Dog drinks water");
    }

    @Override
    public void Sleep() {
        System.out.println("Dog sleeps at night");
    }
}
