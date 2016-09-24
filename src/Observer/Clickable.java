package Observer;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public interface Clickable {
    //单击
    void click();

    //添加单击事件的观察者
    void addClickableObserver(ClickableObserver observer);

    //移除单击事件的观察者
    void removeClickableObserver(ClickableObserver observer);
}
