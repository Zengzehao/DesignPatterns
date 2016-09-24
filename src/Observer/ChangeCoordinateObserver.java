package Observer;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class ChangeCoordinateObserver implements ClickableObserver {
    @Override
    public void clicked(Clickable clickable) {
        Button b = (Button)clickable;
        b.x = 100;
        b.y = 90;
    }
}
