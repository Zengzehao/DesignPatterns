package ChainofResponsibility;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class PlayerA extends Player {
    public PlayerA(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if(i==1){
            System.out.println("PlayerA喝酒");
        }else{
            System.out.println("PlayerA把花向下传");
            next(i);
        }
    }
}
