package Mediator;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class Man extends Person {
    public Man(String name, int age, int requestAge, MarriageAgency agency) {
        super(name, age, Sex.MALE, requestAge, agency);
    }
}
