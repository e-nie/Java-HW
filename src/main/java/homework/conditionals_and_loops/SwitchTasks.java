package homework.conditionals_and_loops;

import java.util.Scanner;

public class SwitchTasks {
    static void main(String[] args) {
//        printDayOfWeek();
//        findTicketPrice();
//        numberToLetter();
//        handleCommands();
        switchCalculator();
    }

    //1. Вывод дня недели по номеру

    public static void printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7: ");
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect Input. Please, enter a valid day of a week");
                break;
        }
    }

    //2. Стоимость билета по дню недели

    public static void findTicketPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        int day = scanner.nextInt();
        if (day <= 5) {
            System.out.println("The ticket price is RUB 300");
        } else if (day <= 7) {
            System.out.println("The ticket price is RUB 450");
        } else {
            System.out.println("Enter the correct day of the week");
        }
    }

    //3. Перевод числовых оценок в буквенные (A–F)
    public static void numberToLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade from 0 to 100: ");
        int points = scanner.nextInt();
        if (points < 0 || points > 100) {
            System.out.println("The number is out of the range.");
        }
        switch (points / 10) {
            case 10://100
            case 9://90-99
                System.out.println("A");
                break;
            case 8://80-89
                System.out.println("B");
                break;
            case 7://70-79
                System.out.println("C");
                break;
            case 6: //60-69
                System.out.println("D");
                break;
            default://0-59
                System.out.println("F");
                break;
        }
    }


    //4. Обработка текстовых команд

    public static void handleCommands() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the command: ");
        String command = scanner.nextLine();
        switch (command) {
            case "start":
                System.out.println("System has started");
                break;
            case "stop":
                System.out.println("System has stopped");
                break;
            case "restart":
                System.out.println("System has restarted");
                break;
            case "status":
                System.out.println("System status: active");
                break;
            default:
                System.out.println("Command not exist");
        }
    }

//5. Простой калькулятор с использованием switch

    public static void switchCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double f = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double s = scanner.nextDouble();
        scanner.nextLine();//there is a \n  - trailing newline which must be eaten(scanner buffer issue)

        System.out.println("Enter arithmetical operator: ");
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator) {
            case "+":
                result = f + s;
                break;
            case "-":
                ;
                result = f - s;
                break;
            case "*":
                result = f * s;
                break;
            case "/":
                if (s == 0) {
                    System.out.println("Arithmetic exception: / by zero");
                }
                result = f / s;
                break;

        }
        System.out.println("Result: " + result);
    }


}










