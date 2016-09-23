package LSP;

/**
 * Created by Zengzehao on 2016/9/20.
 */
public class TestLsp {
    public static void main(String[] args) {
        //声明一个基类对象
        Animal animal;
        //使用基类对象指向子类
        animal = new Horse();
        animal.move();
        animal = new Bird();
        animal.move();
    }
}
