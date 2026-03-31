package homework.exceptions_and_generics.generics;

public class Storage <T>{
    private  T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
