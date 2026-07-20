package homework.programming_principles.after.task_2;

public class Main {
    static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculateDiscount(100, true, true,false));//90
        System.out.println(calculator.calculateDiscount(100, true, false,false));//95
        System.out.println(calculator.calculateDiscount(100, false, false,true));//93
        System.out.println(calculator.calculateDiscount(100, false, false,false));//98

    }
}
