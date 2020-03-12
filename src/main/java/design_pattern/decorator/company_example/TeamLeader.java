package design_pattern.decorator.company_example;

public class TeamLeader extends EmployeeDecorator {
    protected TeamLeader(EmployeeComponent employeeComponent) {
        super(employeeComponent);
    }

    public void planing() {
        System.out.println(this.employeeComponent.getName() + " is planing.");
    }

    public void motivate() {
        System.out.println(this.employeeComponent.getName() + " is motivating his members.");
    }

    public void monitor() {
        System.out.println(this.employeeComponent.getName() + " is monitoring his members.");
    }

    @Override
    public void doTask() {
        employeeComponent.doTask();
        planing();
        motivate();
        monitor();
    }
}
