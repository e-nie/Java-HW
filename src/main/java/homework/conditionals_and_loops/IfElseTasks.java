package homework.conditionals_and_loops;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class IfElseTasks {
    static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { //создаем возможность прочитать введенный нами текст
            printNumber(scanner);
            findLargerNumber(scanner);
            printGrade(scanner);
            isEven(scanner);
            findDiscount(scanner);
            evaluateTestPoints(scanner);
        }
    }
    //1. Определение знака числа

    public static void printNumber(Scanner scanner) {
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();//прочитали введенное число и записали в переменную
        if (number < 0) {
            System.out.println("The number is negative");
        } else if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is zero");
        }
    }

    //2. Поиск наибольшего из двух чисел

    public static void findLargerNumber(Scanner scanner) {
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();
        int max = Math.max(number1, number2);
        System.out.println("The largest number is " + max);
    }

    //3. Вывод оценки по шкале 1–5

    public static void printGrade(Scanner scanner) {
        System.out.println("Enter the grade from 1 to 5: ");
        int grade = scanner.nextInt();
        switch (grade) {
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 2:
                System.out.println("Bad");
                break;
            case 1:
                System.out.println("Very bad");
                break;
            default:
                System.out.println("Incorrect input. Enter number from 1 to 5");
        }
    }


    //4. Проверка на чётность

    public static void isEven(Scanner scanner) {
        System.out.println("Enter any number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
    }

    //5. Определение размера скидки по возрасту

    public static void findDiscount(Scanner scanner) {
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Your discount is 25 %");
        } else if (age >= 65) {
            System.out.println("Your discount is 30 %");
        } else {
            System.out.println("Unfortunately, you are not eligible for a discount");
        }
    }

    //6. Оценка результата теста по баллам

    public static void evaluateTestPoints(Scanner scanner) {
        System.out.println("Enter number of points from 0 to 100: ");
        int points = scanner.nextInt();

        if (points >= 90) {
            System.out.println("Excellent");
        } else if (points >= 75) {
            System.out.println("Good");
        } else if (points >= 60) {
            System.out.println("Satisfactory");
        } else {
            System.out.println("Not Satisfactory");
        }
    }

}