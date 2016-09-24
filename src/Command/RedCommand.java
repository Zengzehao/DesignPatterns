package Command;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class RedCommand extends JButton implements MyCommand {
    private JPanel p;

    public RedCommand(String text, JPanel p) {
        super(text);
        this.p = p;
    }

    @Override
    public void execute() {
        p.setBackground(Color.RED);
    }
}
