package homework.conditionals_and_loops;

import java.util.Scanner;

public class ForTasks {

    static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//        printNumbersDivisibleByThree();
//        sumFromOneToN(scanner);
//        multiplicationTable(scanner);
        isPrimeNumber(scanner);
//            printDigitsFromOneToTen();
        }
    }

    //1. Вывод чисел от 1 до 100, делящихся на 3
    public static void printNumbersDivisibleByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }


    //2. Сумма чисел от 1 до n
    public static void sumFromOneToN(Scanner scanner) {
        System.out.println("Enter number n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of digits from 1 to " + n + " equals " + sum);
    }


    //3. Таблица умножения для числа

    public static void multiplicationTable(Scanner scanner) {
           System.out.println("Enter number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " * " + num + " = " + (i * num));
        }
    }


    //4. Проверка на простое число

    public static void isPrimeNumber(Scanner scanner){
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if(num < 2) {
            isPrime = false;
        } else {
            for(int i = 2; i * i < num; i++) {
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
       if(isPrime) {
           System.out.println(num + " is a prime number");
       } else {
           System.out.println(num + " is not a prime number");
       }
    }

    //5. Вывод чисел от 1 до 10

    public static void printDigitsFromOneToTen(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

}
