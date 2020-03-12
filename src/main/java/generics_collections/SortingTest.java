package generics_collections;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        employee[0] = new Employee(1, "Minh", 10, 4000);
        employee[1] = new Employee(5, "Anh", 80, 1000);
        employee[2] = new Employee(3, "Nam", 40, 2300);
        Arrays.sort(employee);
        System.out.println(Arrays.toString(employee));
        System.out.println();

        //sort employees array using Comparator by Salary
        Arrays.sort(employee, Employee.SalaryComparator);
        System.out.println("Employees list sorted by salary: \n" + Arrays.toString(employee));
        System.out.println();

        //sort employees array using Comparator by Age
        Arrays.sort(employee, Employee.AgeComparator);
        System.out.println("Employees list sorted by age: \n" + Arrays.toString(employee));
        System.out.println();

        //sort employees array using Comparator by Name
        Arrays.sort(employee, Employee.NameComparator);
        System.out.println("Employees list sorted by name: \n" + Arrays.toString(employee));
        System.out.println();

        //Employees list sorted by Id and then Name  using Comparator Class
        employee[2] = new Employee(1, "Hung", 30, 3000);
        Arrays.sort(employee, new EmployeeComparatorByIdAndName());
        System.out.println("Employees list sorted by id and name: \n" + Arrays.toString(employee));
    }

}
