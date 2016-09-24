package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class Button implements Clickable {
    //存储注册过的单击事件观察者
    List<ClickableObserver> observers = new ArrayList<ClickableObserver>();

    //按钮信息
    String color; //颜色
    int x,y;  //坐标

    @Override
    public void click() {
        System.out.println("按钮被单击");
        //执行所有观察者的件事处理方法
        for(int i=observers.size()-1;i>=0;i--){
            observers.get(i).clicked(this);
        }
    }

    @Override
    public void addClickableObserver(ClickableObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeClickableObserver(ClickableObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "按钮颜色："+color+",坐标：("+x+","+y+")";
    }
}
