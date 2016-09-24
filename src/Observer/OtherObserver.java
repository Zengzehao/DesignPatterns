package Observer;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class OtherObserver implements ClickableObserver{
    @Override
    public void clicked(Clickable clickable) {
        System.out.println("执行其他操作");
    }
}
