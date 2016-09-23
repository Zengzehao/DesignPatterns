package SIngleton;

/**
 * Created by Zengzehao on 2016/9/21.
 */
public class GlobalNum {
    private static GlobalNum gn = new GlobalNum();
    private int num = 0;
    public static GlobalNum getInstace(){
        return gn;
    }
    public synchronized int getNum(){
        return ++num;
    }
}
