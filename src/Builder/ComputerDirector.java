package Builder;

/**
 * Created by Zengzehao on 2016/9/22.
 */
public class ComputerDirector {
    ComputerBuilder builder;
    //构造T410型计算机
    public T410 constructT410(){
        builder = new T410Builder();
        builder.bulidCpu();
        builder.buildRam();
        builder.buildHradDisk();
        builder.buildGraphicCrad();
        builder.bulidMonitor();
        builder.buildOs();
        return (T410)builder.getResult();
    }

    public X210 constructX210(){
        builder = new X210Builder();
        builder.bulidCpu();
        builder.buildRam();
        builder.buildHradDisk();
        builder.buildGraphicCrad();
        builder.bulidMonitor();
        builder.buildOs();
        return (X210) builder.getResult();
    }
}
