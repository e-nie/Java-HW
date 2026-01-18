public class HelloWorld {
    //fields bzw. variables

    static int a = 1;

    //methods
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hier ist Evchen");
        System.out.println(20 + 10);
        System.out.println(3 * 5);
        System.out.println("In the a field we keep: " + a);
        int sum1 = sum(20, 10);
        System.out.println(sum1);
        System.out.println(multiply(4, 5));
        System.out.println(subtract(20, 10));
        double divide1 = divide(20, 100);
        System.out.println(divide1);
    }

    public static int sum(int x, int y) {
        //method body
        return x + y;
    }

    public static int multiply(int p, int k) {
        return p * k;
    }


    public static int subtract(int p, int k) {
        return p - k;
    }


    public static double divide(int p, int k) {
        return (double) p / k;
    }


}
