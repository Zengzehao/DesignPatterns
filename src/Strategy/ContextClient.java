package Strategy;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class ContextClient {
    private DiscountStrategy ds;

    public ContextClient(DiscountStrategy ds) {
        this.ds = ds;
    }

    public double contextCalDis(){
        return ds.calculateDiscount();
    }

    public static void main(String[] args) {
        ContextClient context0 = new ContextClient(new NoDiscountStrategy(48.5,20));
        System.out.println("0 折扣"+context0.contextCalDis());

        ContextClient context1 = new ContextClient(new FixDiscountStrategy(46,60));
        System.out.println("固定折扣"+context1.contextCalDis());

        ContextClient context2 = new ContextClient(new PercentageDiscountStrategy(38,40));
        System.out.println("15折折扣"+context2.contextCalDis());
    }


}
