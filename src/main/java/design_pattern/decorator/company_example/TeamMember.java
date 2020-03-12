package design_pattern.decorator.company_example;

public class TeamMember extends EmployeeDecorator {
    protected TeamMember(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    public void reportTask() {
        System.out.println(this.employeeComponent.getName() + " is reporting his assigned tasks.");
    }

    public void coordinateWithOthers() {
        System.out.println(this.employeeComponent.getName() + " is coordinating with other members of his team.");
    }

    @Override
    public void doTask() {
        employeeComponent.doTask();
        reportTask();
        coordinateWithOthers();
    }
}
