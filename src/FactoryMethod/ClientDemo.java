package FactoryMethod;

/**
 * Created by Zengzehao on 2016/9/21.
 */
public class ClientDemo {
    public static void main(String[] args) {
        FruitGardener fruitGardener = null;
        Fruit fruit = null;
        fruitGardener = new AppleGardener();
        fruit = fruitGardener.factory();
        fruit.grow();
        fruit.harvest();
        fruit.plant();

        fruitGardener = new GrapeGardener();
        fruit = fruitGardener.factory();
        fruit.grow();
        fruit.harvest();
        fruit.plant();
    }
}
