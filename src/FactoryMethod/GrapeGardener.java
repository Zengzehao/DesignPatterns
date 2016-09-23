package FactoryMethod;

/**
 * Created by Zengzehao on 2016/9/21.
 */
public class GrapeGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Grape();
    }
}
