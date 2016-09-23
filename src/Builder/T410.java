package Builder;

/**
 * Created by Zengzehao on 2016/9/22.
 * 具体计算机型号类
 */
public class T410 extends Computer {
    private String grapgicCrad;

    public T410() {
        this.setType("ThinkPad T410i");
    }
    public String getGrapgicCrad(){
        return this.grapgicCrad;
    }
    public void setGrapgicCrad(String grapgicCrad){
        this.grapgicCrad=grapgicCrad;
    }

    @Override
    public String toString() {
        return "型号：\t"+this.getType()+"\nCPU:\t"+this.getCpu()+"\n内存:\t"+this.getRam()
                +"\n硬盘：\t"+this.getHardDisk()+"\n显卡：\t"+this.getGrapgicCrad()+"\n显示器:\t"+this.getMonitor()
                +"\n操作系统：\t"+this.getOs();
    }
}
