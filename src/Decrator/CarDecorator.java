package Decrator;

/**
 * Created by Zengzehao on 2016/9/23.
 * 汽车装饰（抽象装饰）
 */
public class CarDecorator implements Car{
    private Car car = null;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void show() {
        this.car.show();
    }
}
