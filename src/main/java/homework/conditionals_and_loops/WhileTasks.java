package homework.conditionals_and_loops;

import java.util.Scanner;

public class WhileTasks {
    static void main(String[] args) {
//        printCountdown();
//        findFactorial();
        printEvenNumbers();
    }

    //1. Вычисление факториала с помощью while

    public static void findFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println("Factorial of n: " + result);
    }

    //2. Вывод всех чётных чисел до заданного

    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //3. Обратный отсчёт от введённого числа до 1
    public static void printCountdown() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number ");
        int number = scanner.nextInt();
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
