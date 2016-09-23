package Adapter;

/**
 * Created by Zengzehao on 2016/9/23.
 */
public class FoodAdpater extends ShuiJiao implements Hundun {
    @Override
    public void makeHundun() {
        super.makeShuiJiao();
        System.out.println("水饺和混沌一样是以面包陷的食品");
    }
}
