package generics_collections;

import java.util.Comparator;

public class EmployeeComparatorByIdAndName implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        int flag = employee.getId() - t1.getId();
        if(flag == 0) flag = employee.getName().compareTo(t1.getName());
        return flag;
    }
}
