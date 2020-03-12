package design_pattern.abstract_factory;

public class Test {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

        Chair chair = factory.createChair();
        //create plastic chair
        chair.create();

        Table table = factory.createTable();
        //create plastic table
        table.create();
    }
}
