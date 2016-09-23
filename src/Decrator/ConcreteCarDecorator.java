package Decrator;

/**
 * Created by Zengzehao on 2016/9/23.
 */
public class ConcreteCarDecorator extends  CarDecorator {
    public ConcreteCarDecorator(Car car) {
        super(car);
    }
    //给汽车进行彩绘
    private void print(){
        System.out.println("给汽车彩绘");
    }

    //给汽车安装Gps
    private void setGps(){
        System.out.println("安装GPS");
    }

    @Override
    public void show() {
        super.show();
        this.print();
        this.setGps();
    }
}
