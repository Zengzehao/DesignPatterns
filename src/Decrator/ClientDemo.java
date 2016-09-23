package Decrator;

/**
 * Created by Zengzehao on 2016/9/23.
 */
public class ClientDemo {
    public static void main(String[] args) {
        Car car = new Benz();
        CarDecorator cd = new ConcreteCarDecorator(car);
        cd.show();
    }
}
