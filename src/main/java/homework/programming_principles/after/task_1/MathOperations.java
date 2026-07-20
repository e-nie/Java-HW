package homework.programming_principles.after.task_1;

//1. Нарушение DRY (Don't Repeat Yourself) – дублирование кода
public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public int add(int a, int b, int c, int d) {
        return add(a, b, c) + d;
    }
}

//Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.
