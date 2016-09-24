package Observer;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class ChangeColorObserver implements ClickableObserver {
    @Override
    public void clicked(Clickable clickable) {
        Button b = (Button) clickable;
        b.color="红色";
    }
}
