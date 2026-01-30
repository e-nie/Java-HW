package practice_4.solvers;

import java.util.Scanner;

public class WhileSolver {
    static void main(String[] args) {
        //method print from 1 to 10
//        printAllNumbersBefore10();

        //method commandReader
//        commandReader();

        //method sum of of digits in a number
        System.out.println(sumOfDigits(1101));


    }

    public static void printAllNumbersBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (!command.equals("exit")) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();
        }
        System.out.println("Finish program");
    }

    public static int sumOfDigits(int number) {
        //number = 123, 1 + 2 + 3
        // 123 % 10 = 3
        //123 / 10 = 12
        //12 % 10 = 2
        //12 / 10 = 1
        //1 % 10 = 1

        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
