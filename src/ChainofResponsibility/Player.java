package ChainofResponsibility;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public abstract class Player {
    private Player successor;
    public abstract void handle(int i);
    protected void setSuccessor(Player aSuccessor){
       this.successor=aSuccessor;
    }

    //传给下一个
    public void next(int index){
        if(successor!=null){
            successor.handle(index);
        }else{
            System.out.println("游戏结束");
        }
    }
}
