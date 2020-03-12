package design_pattern.decorator.company_example;

public class Test {
    public static void main(String[] args) {
        System.out.println("Normal employee:");
        EmployeeComponent employeeComponent = new EmployeeConcreteComponent("Jack");
        employeeComponent.showBasicInformation();
        employeeComponent.doTask();

        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employeeComponent);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employeeComponent);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(new TeamLeader(new EmployeeConcreteComponent("Peter")));
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
