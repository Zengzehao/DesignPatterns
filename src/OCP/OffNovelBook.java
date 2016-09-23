package OCP;

/**
 * Created by Zengzehao on 2016/9/21.
 */
public class OffNovelBook extends NovelBook {
    public OffNovelBook(String name, double price, String author) {

        super(name, price, author);
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.9;
    }
}
