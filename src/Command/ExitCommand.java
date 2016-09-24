package Command;

import javax.swing.*;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class ExitCommand extends JButton implements MyCommand {
    public ExitCommand(String text) {
        super(text);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
