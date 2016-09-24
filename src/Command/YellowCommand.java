package Command;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Zengzehao on 2016/9/24.
 * 具体命令角色，让面板变为黄色的命令
 */
public class YellowCommand extends JButton implements MyCommand{
    private JPanel p;
    //构造函数

    public YellowCommand(String text, JPanel p) {
        super(text);
        this.p = p;
    }

    @Override
    public void execute() {
        //改变面板背景的颜色
        p.setBackground(Color.YELLOW);
    }
}
