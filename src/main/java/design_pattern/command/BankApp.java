package design_pattern.command;

public class BankApp {
    private Command openCommand;
    private Command closeCommand;

    public BankApp(Command openCommand, Command closeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
    }

    public void clickOpenAccount() {
        System.out.println("User click open an account");
        openCommand.execute();
    }

    public void clickCloseAccount() {
        System.out.println("User click close an account");
        closeCommand.execute();
    }


}
