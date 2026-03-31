package homework.exceptions_and_generics.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    static void main(String[] args) {
        //1. Обработка проверяемого исключения
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        divide(5, 0);
    }


    //2. Обработка непроверяемого исключения
    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: Division by zero");
        }
    }


}
