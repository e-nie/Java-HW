package homework.conditionals_and_loops;

import java.util.Scanner;

public class DoWhile {
    static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//            findPositive(scanner);
//            checkPassword(scanner);
//        printDigits();
//            enterExitCommand(scanner);
            numberOfDigits(scanner);
        }
    }

    //1. Запрос положительного числа
    public static void findPositive(Scanner scanner) {
        int num;
        do {
            System.out.println("Enter number: ");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.println("You entered a positive number " + num);
    }

    //2. Проверка пароля

    public static void checkPassword(Scanner scanner) {
        String password;
        do {
            System.out.println("Enter password: ");
            password = scanner.nextLine();
        } while (!password.equals("admin"));
        System.out.println("You are authorised");
    }

    //3. Вывод чисел от 1 до 10 с использованием do-while

    public static void printDigits() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    //4. Завершение программы по команде "exit"

    public static void enterExitCommand(Scanner scanner) {
        String command;
        do {
            System.out.println("Enter command: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.println("Exit of the program");
    }

    //5. Подсчёт количества цифр в числе

    public static void numberOfDigits(Scanner scanner) {
        System.out.println("Enter any integer: ");
        int num = scanner.nextInt();
        int count = 0;
        int originalNum = num;

        do {
            count++; //1//2//3
            num = num / 10; //555-> 55 ->5-> 0.5
        } while (num > 0);

        System.out.println("Number of digits in " + originalNum + " :  " + count);
    }

}
