package Strategy;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class PercentageDiscountStrategy extends DiscountStrategy {
    public PercentageDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return getNumber()*getPrice()*0.15;
    }
}
