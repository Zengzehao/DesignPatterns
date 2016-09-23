package OCP;

/**
 * Created by Zengzehao on 2016/9/21.
 */
public class NovelBook implements IBook {
    //书名
    private String name;
    //书的价格
    private double price;
    //书的作者
    private String author;

    public NovelBook(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
