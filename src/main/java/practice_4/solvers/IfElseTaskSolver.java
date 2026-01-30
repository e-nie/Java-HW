package practice_4.solvers;

public class IfElseTaskSolver {
    /**
     * Method to check whether a number is even
     *
     * @param number
     * @return
     */
    public static String getParity(int number) {
        String parity = "Odd";
        if (number % 2 == 0) {
            parity = "Even";
        }
        return parity;
    }

    public static String checkAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Minor";
        } else if (age <= 60) {
            ageDescription = "Adult";
        } else {
            ageDescription = "Elderly";
        }
        return ageDescription;
    }

    public  static int  checkMax(int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB) {
            max = c;
        }
        return max;
    }


   public static void main() {
        //method to check if a number is even
        System.out.println(getParity(5));
        System.out.println(getParity(6));

        //method to check age
        System.out.println(checkAge(4));
        System.out.println(checkAge(21));
        System.out.println(checkAge(74));

        //method to find max
        System.out.println(checkMax(21,12,1456));

    }
}
