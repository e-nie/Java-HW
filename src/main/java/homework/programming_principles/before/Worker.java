package homework.programming_principles.before;
//7. Нарушение ISP (Interface Segregation Principle) – слишком большой интерфейс

interface Worker {
    void work();
    void eat();
}
class Programmer implements Worker {
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }
}

//Задача: Разделите интерфейс на отдельные специализированные интерфейсы.
