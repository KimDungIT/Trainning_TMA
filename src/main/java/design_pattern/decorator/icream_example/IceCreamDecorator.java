package design_pattern.decorator.icream_example;

public abstract class IceCreamDecorator implements IceCream {
    protected IceCream specialIceCream;

    public IceCreamDecorator(IceCream specialIceCream) {
        this.specialIceCream = specialIceCream;
    }
    @Override
    public String makeIceCream() {
        return specialIceCream.makeIceCream();
    }
}
