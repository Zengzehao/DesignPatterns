package TemplateMethod;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public abstract class Acconut {
    //账号
    private String accountNumber;
    //构造函数

    public Acconut() {
        accountNumber = null;
    }

    public Acconut(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //基本方法，确定账号类型，留给子类实现
    protected abstract String getAccountType();
    //基本方法，确定利息，留给子类实现
    protected abstract double getIntersetRate();

    //基本方法，根据账号类型和账号确定账号余额
    public double calculateAmount(String AccountType,double AccountNumber){
        return 4567.00D;
    }

    //模板方法，计算账号利息
    public double culcalateInterest(){
        String accountType = getAccountType();
        double interestRate = getIntersetRate();
        double amount = calculateAmount(accountType,interestRate);
        return amount*interestRate;
    }

}
