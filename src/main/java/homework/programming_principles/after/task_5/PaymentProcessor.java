package homework.programming_principles.after.task_5;

//5. Нарушение OCP (Open/Closed Principle) – закрытый для расширения код
public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }

}
//Задача: Избавьтесь от if-else, применив полиморфизм (наследование или интерфейсы).
