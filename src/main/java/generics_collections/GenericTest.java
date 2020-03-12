package generics_collections;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Rectangle> rectangleList = new ArrayList<Rectangle>();
        rectangleList.add(new Rectangle());

        List<Circle> circleList = new ArrayList<Circle>();
        circleList.add(new Circle());
        circleList.add(new Circle());
        drawShape(circleList);
        drawShape(rectangleList);

        //generic method print array
        Integer[] intArray = {1, 2, 3, 4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] characterArray = {'H', 'U', 'O'};
        System.out.println("intArray: ");
        printArray(intArray);
        System.out.println("doubleArray: ");
        printArray(doubleArray);
        System.out.println("characterArray: ");
        printArray(characterArray);

        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        integerBox.set(10);
        stringBox.set("Hello world");
        System.out.println("integerBox: " + integerBox.get());
        System.out.println("stringBox: " + stringBox.get());

        KeyValuePair<String, Integer> entry = new KeyValuePair<String, Integer>("abc", 1234);
        String name = entry.getKey();
        Integer id = entry.getValue();
        System.out.println("name: " + name + " " + "id: " + " " + id);
    }

    public static void drawShape(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
        }
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(String.valueOf(element));
        }
        System.out.println();
    }
}
