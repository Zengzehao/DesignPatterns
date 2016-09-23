package LoD;

/**
 * Created by Zengzehao on 2016/9/20.
 */
public class Someone {
    //通过Friend间接电泳Stranger类中的方法
    public void call(Friend friend){
        friend.forward();
    }
}
