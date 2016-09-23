package Proxy;

/**
 * Created by Zengzehao on 2016/9/22.
 */
public class ClientDemo {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("李逍遥");
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.killBoss();
        proxy.upGrade();

    }
}
