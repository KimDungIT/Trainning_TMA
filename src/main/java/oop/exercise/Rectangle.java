package oop.exercise;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double s = getWidth() * getHeight();
        return Math.round(s * 10) / 10;
    }

    @Override
    void printInfo() {
        System.out.println("Width: " + getWidth() + ", " + "height: " + getHeight());
        System.out.println("Area of rectangle: " + getArea());
    }
}
