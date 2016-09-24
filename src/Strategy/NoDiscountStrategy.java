package Strategy;

/**
 * Created by Zengzehao on 2016/9/24.
 * 具体折扣，没有折扣算法
 */
public class NoDiscountStrategy extends DiscountStrategy{
    public NoDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
