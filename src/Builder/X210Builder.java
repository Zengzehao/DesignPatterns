package Builder;

/**
 * Created by Zengzehao on 2016/9/22.
 */
public class X210Builder implements ComputerBuilder {
    private X210 computer= new X210();

    @Override
    public void bulidCpu() {
        computer.setCpu("i3-450");
    }

    @Override
    public void buildRam() {
        computer.setRam("2GB 1333MHZ");
    }


    @Override
    public void buildHradDisk() {
        computer.setHardDisk("250GB 5000转");
    }

    @Override
    public void buildGraphicCrad() {

    }

    @Override
    public void bulidMonitor() {
        computer.setMonitor("14英寸 1280*800");
    }

    @Override
    public void buildOs() {
        computer.setOs("Window7 Home版");
    }

    @Override
    public X210 getResult() {
        return computer;
    }
}
