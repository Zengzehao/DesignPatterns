package DIP;

/**
 * Created by Zengzehao on 2016/9/20.
 */
//司机类
public class Driver implements IDriver {
    //司机的主要职责是驾驶
    public void drive(ICar car){
        car.run();
    }
}
