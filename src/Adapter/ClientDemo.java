package Adapter;

/**
 * Created by Zengzehao on 2016/9/23.
 */
public class ClientDemo {
    public static void main(String[] args) {
        Hundun h = new FoodAdpater();
        h.makeHundun();
    }
}
