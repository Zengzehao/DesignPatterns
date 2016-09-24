package TemplateMethod;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class FixedAccount extends Acconut {
    @Override
    protected String getAccountType() {
        return "一年定期";
    }

    @Override
    protected double getIntersetRate() {
        return 0.0325D;
    }
}
