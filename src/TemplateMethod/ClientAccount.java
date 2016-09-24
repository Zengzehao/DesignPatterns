package TemplateMethod;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class ClientAccount {
    public static void main(String[] args) {
        Acconut acconut = new DemandAccunt();
        System.out.println("活期利息为："+acconut.culcalateInterest());
        acconut = new FixedAccount();
        System.out.println("一年定期利息为"+acconut.culcalateInterest());
    }
}
