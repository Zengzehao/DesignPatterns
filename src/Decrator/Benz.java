package Decrator;

/**
 * Created by Zengzehao on 2016/9/23.
 * 奔驰车（裸车，需要装饰）
 */
public class Benz implements Car{
    @Override
    public void show() {
        System.out.println("奔驰车的默认颜色是黑色");
    }
}
