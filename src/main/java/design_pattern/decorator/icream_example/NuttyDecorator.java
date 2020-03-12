package design_pattern.decorator.icream_example;

public class NuttyDecorator extends IceCreamDecorator {
    public NuttyDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }

    @Override
    public String makeIceCream() {
        return specialIceCream.makeIceCream() + addNuts();
    }

    private String addNuts() {
        return " + cruncy nuts";
    }
}
