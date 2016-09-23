package SIngleton;

/**
 * Created by Zengzehao on 2016/9/21.
 */
public class SingleDemo {
    //测试单例模式
    public static void main(String[] args) {
        NumThread threadA = new NumThread("线程A");
        NumThread threadB = new NumThread("线程B");
        threadA.start();
        threadB.start();
    }
}

//线程类
class NumThread extends Thread{
    private String threadName;
    public NumThread(String name){
        threadName=name;
    }

    //重写线程的run方法（线程任务 ）
    public void run(){
        GlobalNum gnObj = GlobalNum.getInstace();
        //循环访问，输出访问次数
        for (int i = 0; i <5 ; i++) {
            System.out.println(threadName+"第"+gnObj.getNum()+"次访问！");
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}