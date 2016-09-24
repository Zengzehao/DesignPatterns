package ChainofResponsibility;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class PlayerB extends Player{
    public PlayerB(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if(i==2){
            System.out.println("PlayerB喝酒");
        }else{
            System.out.println("PlayerB把花向下传");
            next(i);
        }
    }
}
