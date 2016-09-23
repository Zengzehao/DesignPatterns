package DIP;

/**
 * Created by Zengzehao on 2016/9/20.
 */
public class TestDIP {
    public static void main(String[] args) {
        //实例化一个司机tom
        IDriver tom = new Driver();
        //实例化一辆宝马
        ICar car = new BWM();
        tom.drive(car);
    }
}
