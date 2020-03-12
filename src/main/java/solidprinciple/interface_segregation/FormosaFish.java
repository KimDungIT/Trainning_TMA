package solidprinciple.interface_segregation;

public class FormosaFish implements Animal, Fish{
    @Override
    public void Eat() {
        System.out.println("Eat...");
    }

    @Override
    public void Drink() {
        System.out.println("Drink...");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleep...");
    }

    @Override
    public void Swim() {
        System.out.println("Swim...");
    }
}
