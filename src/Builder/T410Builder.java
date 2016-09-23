package Builder;

/**
 * Created by Zengzehao on 2016/9/22.
 */
public class T410Builder implements ComputerBuilder {
    private T410 computer= new T410();

    @Override
    public void bulidCpu() {
        computer.setCpu("i5-450");
    }

    @Override
    public void buildRam() {
        computer.setRam("4GB 1333MHZ");
    }


    @Override
    public void buildHradDisk() {
        computer.setHardDisk("500GB 7200转");
    }

    @Override
    public void buildGraphicCrad() {
        computer.setGrapgicCrad("NAvdis NVS 3100M");
    }

    @Override
    public void bulidMonitor() {
        computer.setMonitor("14英寸 1280*800");
    }

    @Override
    public void buildOs() {
        computer.setOs("Window7 旗舰版");
    }

    @Override
    public T410 getResult() {
        return computer;
    }
}
