package Bridge;

/**
 * Created by Zengzehao on 2016/9/23.
 */
public abstract class AbstractShape {
    Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
