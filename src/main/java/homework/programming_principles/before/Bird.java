package homework.programming_principles.before;

//6. Нарушение LSP (Liskov Substitution Principle) – некорректное поведение подклассов
class Bird {
    public void fly() {
        System.out.println("Птица летит");
    }
}
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвины не летают");
    }
}
//Задача: Перепроектируйте код так, чтобы классы-наследники не нарушали поведение базового класса.
