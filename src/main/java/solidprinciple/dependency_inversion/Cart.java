package solidprinciple.dependency_inversion;

public class Cart {
    public void Checkout(int orderId, int userId) {
        IDatabase database = new Database();
        database.Save(orderId);

        ILogger logger = new Logger();
        logger.LogInfo("Order has ben checkout");

        IEmailSender emailSender = new EmailSender();
        emailSender.SendEmail(userId);
    }
}
