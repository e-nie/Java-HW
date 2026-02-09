package livecoding_strategy;

public class FixedDiscount implements Discountable{
    private int fixedSum;

    public FixedDiscount(int fixedSum) {
        this.fixedSum = fixedSum;
    }

    @Override
    public double discount(double price) {
        return  fixedSum;
    }
}
