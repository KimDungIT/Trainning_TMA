package solidprinciple.liskov_substitution;

public class Test {
    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich("red", 4.5);
        ostrich.printInfo();
        Duck duck = new Duck("yellow", 2.3);
        duck.fly();
    }
}
