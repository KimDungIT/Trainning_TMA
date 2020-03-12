package generics_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericWildcards {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(6);
        printData(ints);

        double sum = sum(ints);
        System.out.println("Sum of ints = " + sum);

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        System.out.println("Displaying the Integer values");
        addNumbers(integerList);
        System.out.println();
        List<Number> numberList = Arrays.asList(1.0, 2.0, 3.0);
        System.out.println("Displaying the Integer values");
        addNumbers(numberList);
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void printData(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + "::");
        }
    }

    public static void addNumbers(List<? super Integer> list) {
        for (Object obj :  list) {
            System.out.println(obj);
        }
    }
}
