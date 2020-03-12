package solidprinciple.liskov_substitution;

public class Bird {
    private String color;
    private double weight;

    public Bird(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("This is a bird");
    }
}
