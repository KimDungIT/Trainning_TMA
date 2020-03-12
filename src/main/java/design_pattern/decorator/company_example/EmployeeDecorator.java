package design_pattern.decorator.company_example;

import java.util.Date;

public abstract class EmployeeDecorator implements EmployeeComponent {
    protected EmployeeComponent employeeComponent;

    protected EmployeeDecorator(EmployeeComponent employeeComponent) {
        this.employeeComponent = employeeComponent;
    }

    @Override
    public String getName() {
        return employeeComponent.getName();
    }

    @Override
    public void join(Date joinDate) {
        employeeComponent.join(joinDate);
    }

    @Override
    public void terminate(Date theDate) {
        employeeComponent.terminate(theDate);
    }
}
