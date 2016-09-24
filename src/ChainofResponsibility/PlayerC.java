package ChainofResponsibility;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class PlayerC extends Player {
    public PlayerC(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if(i==3){
            System.out.println("PlayerC喝酒");
        }else{
            System.out.println("PlayerC把花向下传");
            next(i);
        }
    }
}
