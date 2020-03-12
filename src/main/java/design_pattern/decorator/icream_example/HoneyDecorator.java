package design_pattern.decorator.icream_example;

public class HoneyDecorator extends IceCreamDecorator {
    public HoneyDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }

    @Override
    public String makeIceCream() {
        return specialIceCream.makeIceCream() + addHoney();
    }

    private String addHoney() {
        return " + sweet honey";
    }
}
