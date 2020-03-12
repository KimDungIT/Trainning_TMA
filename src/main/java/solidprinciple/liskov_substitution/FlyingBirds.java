package solidprinciple.liskov_substitution;

public class FlyingBirds extends Bird {
    public FlyingBirds(String color, double weight) {
        super(color, weight);
    }

    public void fly() {
        System.out.println("A bird can fly!!!");
    }
}
