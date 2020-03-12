package oop.exercise;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double s = Math.PI * getRadius() * getRadius();
        return Math.round(s * 10) / 10;
    }

    @Override
    public void printInfo() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Area of circle: " + getArea());
    }

}
