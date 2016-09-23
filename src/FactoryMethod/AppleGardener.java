package FactoryMethod;

/**
 * Created by Zengzehao on 2016/9/21.
 */
//具体工厂，用于生产苹果
public class AppleGardener implements FruitGardener{
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
