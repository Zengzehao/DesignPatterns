package Builder;

/**
 * Created by Zengzehao on 2016/9/22.
 * 计算机BUilder
 */
public interface ComputerBuilder {
    void bulidCpu();
    void buildRam();
    void buildHradDisk();
    void buildGraphicCrad();
    void bulidMonitor();
    void buildOs();

    Computer getResult();
}
