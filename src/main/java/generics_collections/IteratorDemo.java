package generics_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList listLanguages = new ArrayList();

        // them phan tu vao array list
        listLanguages.add("Java");
        listLanguages.add("Python");
        listLanguages.add("PHP");
        listLanguages.add(".NET");
        listLanguages.add("C");
        listLanguages.add("C++");
        System.out.println("Danh sach ngon ngu lap trinh");
        Iterator iterator = listLanguages.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }

        //sua cac phan tu
        ListIterator listIterator = listLanguages.listIterator();
        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            listIterator.set(element + " (PASS)");
        }

        System.out.println("Noi dung da sua: ");
        iterator = listLanguages.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
        System.out.println();

        //hien thi cac phan tu theo thu tu nguoc lai
        System.out.println("Noi dung da sua theo thu tu nguoc lai: ");
        while (listIterator.hasPrevious()) {
            Object element = listIterator.previous();
            System.out.println(element);
        }
        System.out.println();

        //xoa phan tu
        listIterator = listLanguages.listIterator();
        while (listIterator.hasNext()) {
            Object element = listIterator.next();
            if("C (PASS)".equals(element)) {
                listIterator.remove();
            }
        }
        System.out.println("Noi dung da sua: ");
        iterator = listLanguages.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
    }
}
