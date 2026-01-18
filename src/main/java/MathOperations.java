public class MathOperations {


    public static void main(String[] args) {
        System.out.println(add(100, 5));
        System.out.println(subtract(100, 5));
        System.out.println(multiply(100, 5));
        System.out.println(divide(5, 50));
        System.out.println(findMax(15, 16));
        System.out.println(difference(15, 16));
        System.out.println(squareArea(15));
        System.out.println(squarePerimeter(15));
        System.out.println(convertSecondsToMinutes(1300));

        System.out.println(averageSpeed(1300, 5));
        System.out.println(averageSpeed(300, 2));
        System.out.println(averageSpeed(13, 0.45));

        System.out.println(findHypotenuse(13, 12));
        System.out.println(findHypotenuse(10, 20));
        System.out.println(findHypotenuse(20, 25));

        System.out.println(circleCircumference(30));
        System.out.println(calculatePercentage(120, 30));
        System.out.println(celsiusToFahrenheit( 30));
        System.out.println(fahrenheitToCelsius(79));



    }

    //Создайте класс MathOperations с методами:
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }


    //2. Реализуйте метод для нахождения максимума двух чисел
    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

    //3. Метод для нахождения разницы между двумя числами
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    //4. Методы для площади и периметра квадрата
    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    //5. Метод для перевода секунд в минуты
    public static double convertSecondsToMinutes(int seconds) {
        int secondsInMinute = 60;
        return (double) seconds / secondsInMinute;
    }

    //6. Метод для вычисления средней скорости
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    //7. Метод для нахождения гипотенузы
    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    //8. Метод для длины окружности
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    //9. Метод для вычисления процентов
    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    //10. Методы перевода температуры
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }


}
