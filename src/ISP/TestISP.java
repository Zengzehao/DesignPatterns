package ISP;

/**
 * Created by Zengzehao on 2016/9/20.
 */
public class TestISP {
    public static void main(String[] args) {
        IOrderForPortal op = Order.getOrderForPortal();
        System.out.println(op.getOrder());

        IOrderForOtherSys os = Order.getIOrderForOtherSys();
        os.insertOrder();

        IOrderForAdmin oa = Order.getIOrderForAdmin();
        System.out.println(oa.getOrder());
        oa.insertOrder();
        oa.deleteOrder();
        oa.updateOrder();
    }
}
