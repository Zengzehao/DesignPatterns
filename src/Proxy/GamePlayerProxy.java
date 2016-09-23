package Proxy;

import java.util.Date;

/**
 * Created by Zengzehao on 2016/9/22.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer player = null;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    //记录打怪时间
    public void log(){
        System.out.println("打怪时间"+new Date().toString());
    }

    @Override
    public void killBoss() {
        this.log();
        player.killBoss();
    }

    @Override
    public void upGrade() {
        this.log();
        player.upGrade();
    }

    //计算升级所需的时间
    public void count(){
        System.out.println("升1级耗费50小时");
    }
}
