package oop.exercise;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(1.5);
        Circle secondCircle = new Circle(4.5);

        firstCircle.printInfo();
        secondCircle.printInfo();

        //create array circles
        Circle[] circles = new Circle[100];
        double sum = 0;
        Random random = new Random();
        int rangeMin = 1;
        int rangeMax = 10;
        double smallestArea = 0;
        double biggestArea = 0;

        for (int i = 0; i< circles.length; i++) {
            double radius = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
            circles[i] = new Circle(radius);
            smallestArea = circles[0].getArea();
            biggestArea = circles[0].getArea();
            sum +=circles[i].getArea();

            if(circles[i].getArea() < smallestArea) {
                smallestArea = circles[i].getArea();
            }
            if(circles[i].getArea() > smallestArea) {
                biggestArea = circles[i].getArea();
            }

        }

        System.out.println("Sum of area: " + sum);
        System.out.println("Biggest area: "+ biggestArea);
        System.out.println("Smallest area: " + smallestArea);

    }
}
