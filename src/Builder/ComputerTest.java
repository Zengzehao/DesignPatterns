package Builder;

/**
 * Created by Zengzehao on 2016/9/22.
 */
public class ComputerTest {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        Computer t410 = director.constructT410();
        System.out.println(t410);

        System.out.println("------------------------");

        Computer x210 = director.constructX210();
        System.out.println(x210);
    }
}
