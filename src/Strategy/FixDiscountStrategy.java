package Strategy;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class FixDiscountStrategy extends DiscountStrategy {
    public FixDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return getNumber()*1;
    }
}
