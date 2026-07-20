package homework.programming_principles.after.task_4;

//4. Нарушение SRP (Single Responsibility Principle) – класс выполняет несколько задач
public class Order {
    public void processOrder() {
        System.out.println("Обрабатываем заказ...");
    }
}
//Задача: Разделите класс Order на отдельные классы, каждый из которых выполняет только одну задачу.

