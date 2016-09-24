package TemplateMethod;

/**
 * Created by Zengzehao on 2016/9/24.
 * 具体模板类，活期账号
 */
public class DemandAccunt extends  Acconut{
    @Override
    protected String getAccountType() {
        return "活期";
    }

    @Override
    protected double getIntersetRate() {
        return 0.005D;
    }
}
