package SIngleton;

/**
 * Created by Zengzehao on 2016/9/21.
 * 懒汉式单例
 */
public class Singleton2 {
    private static Singleton2 _instance = null;
    private Singleton2(){

    }

    synchronized public static Singleton2 getInstance(){
        if(_instance==null){
            _instance = new Singleton2();
        }
        return _instance;
    }
}
