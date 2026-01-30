package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {

    static void main(String[] args) {
        //check guess random number method
//        guessNumber(15);

        //check method print min number
//        printMinimum();

        //check method for checking credentials
        checkCredentials();
    }


    public static void guessNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);

        int number;
        do {
            System.out.print("Guess the number: ");
            number = scanner.nextInt();//read the user's input
            if (number < random) {
                System.out.println("Greater!");
            } else if (number > random) {
                System.out.println("Smaller!");
            }
        } while (number != random);

        System.out.println("Correct!");
    }


    public static void printMinimum() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = 2_147_483_647;
        do {
            System.out.println("Enter number: ");
            number = scanner.nextInt();// user enters number
            if (number < min && number >= 0) {
                min = number;
            }
        }
        while (number >= 0);
        System.out.println("Min Number: " + min);
    }


    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);
        String login;
        String password;

        do {
            System.out.println("Enter login: ");
            login = scanner.nextLine();
            System.out.println("Enter password: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("You are successfully authorised.");
    }

}
