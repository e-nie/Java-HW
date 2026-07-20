package homework.programming_principles.after.task_4;

public class Main {
    static void main(String[] args) {
        Order order  = new Order();
        EmailConfirmationService service = new EmailConfirmationService();
        InvoiceGenerator generator = new InvoiceGenerator();

        order.processOrder();
        service.sendEmailConfirmation();
        generator.generateInvoice();
    }
}
