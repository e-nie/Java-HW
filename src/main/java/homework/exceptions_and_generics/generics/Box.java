package homework.exceptions_and_generics.generics;
//1. Задача на дженерик класс
//Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
// Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.

public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}

