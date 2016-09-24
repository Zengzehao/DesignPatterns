package Bridge;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class Test {
    public static void main(String[] args) {
        Color color = new Green();
        AbstractShape shape = new Square(color);
        shape.draw();
    }
}
