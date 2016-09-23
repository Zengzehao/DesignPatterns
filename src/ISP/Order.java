package ISP;

/**
 * Created by Zengzehao on 2016/9/20.
 */
public class Order implements IOrderForAdmin,IOrderForOtherSys,IOrderForPortal {
    //返回Portal
    public static IOrderForPortal getOrderForPortal(){
        return new Order();
    }
    public static IOrderForOtherSys getIOrderForOtherSys(){
        return new Order();
    }
    public static IOrderForAdmin getIOrderForAdmin(){
        return new Order();
    }

    @Override
    public void deleteOrder() {
        System.out.println("删除订单");
    }

    @Override
    public String getOrder() {
        return "返回订单";
    }

    @Override
    public void insertOrder() {
        System.out.println("插入订单");
    }

    @Override
    public void updateOrder() {
        System.out.println("更新订单");
    }
}
