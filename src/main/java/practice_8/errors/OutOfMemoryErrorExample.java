package practice_8.errors;

import java.util.ArrayList;
import java.util.List;

//Java heap space
public class OutOfMemoryErrorExample {
    static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while(true){
            list.add(new byte[1024 * 1024]);//добавляем 1 МБ в список бесконечно
        }
    }
}
