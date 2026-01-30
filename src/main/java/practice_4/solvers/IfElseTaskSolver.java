package practice_4;

public class IfElseTaskSolver {
    /**
     * Method to check whether a number is even
     *
     * @param number
     * @return
     */
    public String getParity(int number) {
        String parity = "Odd";
        if (number % 2 == 0) {
            parity = "Even";
        }
        return parity;
    }

    public String checkAge(int age) {
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

    public int checkMax(int a, int b, int c) {
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


}
