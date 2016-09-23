package FactoryMethod;

/**
 * Created by Zengzehao on 2016/9/21.
 */
//具体产品，苹果
public class Apple implements Fruit{
    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    @Override
    public void grow() {
        System.out.println("苹果正在生长。。。");
    }

    @Override
    public void harvest() {
        System.out.println("收获苹果");
    }

    @Override
    public void plant() {
        System.out.println("栽种苹果");
    }
}
