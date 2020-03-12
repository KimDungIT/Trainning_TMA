package solidprinciple.interface_segregation;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Eat();
        dog.Drink();
        dog.Sleep();

        FormosaFish formosaFish = new FormosaFish();
        formosaFish.Eat();
        formosaFish.Drink();
        formosaFish.Sleep();
        formosaFish.Swim();
    }
}
