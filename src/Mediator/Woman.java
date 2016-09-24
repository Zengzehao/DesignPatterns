package Mediator;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class Woman extends Person {
    public Woman(String name, int age, int requestAge, MarriageAgency agency) {
        super(name, age, Sex.FEMALE, requestAge, agency);
    }
}
