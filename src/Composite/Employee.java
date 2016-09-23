package Composite;

/**
 * Created by Zengzehao on 2016/9/23.
 */
public class Employee implements Company {
    private String name; //姓名
    private String position; //职位
    private int salary; //薪水

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo(){
        String info="";
        info = "名称："+this.name;
        info = info+"\t职位："+this.position;
        info = info+"\t薪水："+this.salary;

        return info;
    }
}
