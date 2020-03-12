package design_pattern.abstract_factory;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}
