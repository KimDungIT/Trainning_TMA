package design_pattern.command;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("dung");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
