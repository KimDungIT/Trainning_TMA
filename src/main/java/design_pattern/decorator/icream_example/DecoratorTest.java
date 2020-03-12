package design_pattern.decorator.icream_example;

public class DecoratorTest {
    public static void main(String[] args) {
        IceCream iceCream = new HoneyDecorator(new SimpleIceCream());
        System.out.println(iceCream.makeIceCream());
        IceCream iceCream1 = new NuttyDecorator(new HoneyDecorator(new SimpleIceCream()));
        System.out.println(iceCream1.makeIceCream());
    }
}
