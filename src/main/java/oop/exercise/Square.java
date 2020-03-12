package oop.exercise;

public class Square extends Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        double s = getWidth() * getWidth();
        return Math.round(s * 10) / 10;
    }

    @Override
    void printInfo() {
        System.out.println("Width: " + getWidth());
        System.out.println("Area of square: " + getArea());
    }
}
