package homework.conditionals_and_loops;

import java.util.Scanner;

public class BreakContinue {
    static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {


//            sumOfNumbers(scanner);
//        skipDivisibleToThree();
//            printOnlyPositiveFIRST_OPTION(scanner);
//            printOnlyPositiveSECOND_OPTION(scanner);
            enterLinesBeforeStop(scanner);
        }
    }

    //1. Сумма чисел до первого отрицательного (использовать break)

    public static void sumOfNumbers(Scanner scanner) {
        int sum = 0;
        while (true) {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }

    //2. Пропуск чисел, делящихся на 3 (использовать continue)

    public static void skipDivisibleToThree() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    //3. Вывод только положительных чисел (использовать continue)

    public static void printOnlyPositiveFIRST_OPTION(Scanner scanner) {
        int num;
        do {
            System.out.println("Enter a number: ");
            num = scanner.nextInt();
            if (num < 0) {
                continue;
            }
            System.out.println(num);
        } while (num != 0);
    }

    public static void printOnlyPositiveSECOND_OPTION(Scanner scanner) {
        while (true) {
            System.out.println("Enter a number (0 for exit): ");
            int num = scanner.nextInt();
            if (num == 0) break;
            if (num < 0) continue;
            System.out.println("Positive number: " + num);
        }
        System.out.println("End of the Program");
    }


    //4. Ввод строк до команды "stop" (использовать break)

    public static void enterLinesBeforeStop(Scanner scanner) {
        while (true) {
            System.out.println("Enter line: ('stop' - to finish the program)");
            String line = scanner.nextLine();
            if (line.equals("stop")) break;

            System.out.println("You entered " + line);
        }
        System.out.println("End of the Program");
    }

}
