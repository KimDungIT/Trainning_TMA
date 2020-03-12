package design_pattern.decorator.company_example;

public class Manager extends EmployeeDecorator {
    protected Manager(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    public void createRequirement() {
        System.out.println(this.employeeComponent.getName() + " is create requirements.");
    }

    public void assignTask() {
        System.out.println(this.employeeComponent.getName() + " is assigning tasks.");
    }

    public void manageProgress() {
        System.out.println(this.employeeComponent.getName() + " is managing the progress.");
    }

    @Override
    public void doTask() {
        employeeComponent.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
