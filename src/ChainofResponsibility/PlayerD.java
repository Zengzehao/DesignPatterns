package ChainofResponsibility;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class PlayerD extends Player {
    public PlayerD(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if(i==4){
            System.out.println("PlayerD喝酒");
        }else{
            System.out.println("PlayerD把花向下传");
            next(i);
        }
    }
}
