package practice_4.solvers;

public class ForTaskSolver {
    static void main() {
        //check multiple table for a number
//        multTable(5);

        //check the sum of all numbers before n
//        System.out.println(sumOfAllNumbers(10));
//        System.out.println(checkIfPrimeNumber(11));
//        System.out.println(checkIfPrimeNumber(21));

        //print all prime numbers before 100
        printAllPrimeNumbersBefore100();
    }


    public static void multTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    num + " x " + i + " = " + num * i);
        }
    }


    public static int sumOfAllNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //check if the number is prime number
    public static boolean checkIfPrimeNumber(int num) {
        boolean isPrimeNumber = true;

        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }

    public static void printAllPrimeNumbersBefore100() {
        for (int i = 2; i <= 100; i++) {
            if (checkIfPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
