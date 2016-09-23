package Builder;

/**
 * Created by Zengzehao on 2016/9/22.
 * 具体计算机型号类
 */
public class X210 extends Computer {
    public X210() {
        this.setType("ThinkPad X210");
    }
    @Override
    public String toString() {
        return "型号：\t"+this.getType()+"\nCPU:\t"+this.getCpu()+"\n内存:\t"+this.getRam()
                +"\n硬盘：\t"+this.getHardDisk()+"\n显示器:\t"+this.getMonitor()
                +"\n操作系统：\t"+this.getOs();
    }
}
