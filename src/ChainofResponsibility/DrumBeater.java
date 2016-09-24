package ChainofResponsibility;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class DrumBeater {
    public static void main(String[] args) {
        //创建一个链
        Player player = new PlayerA(new PlayerB(new PlayerC(new PlayerD(null))));
        //击鼓3下
        player.handle(3);
    }
}
