package Mediator;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class Person {
    String name;
    int age;
    Sex sex;
    int requestAge;
    MarriageAgency agency; //婚姻中介所

    public Person(String name, int age, Sex sex, int requestAge, MarriageAgency agency) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency = agency;
        agency.register(this); //注册会员
    }

    //寻找对象
    public void findPartner(){
        agency.pair(this);
    }

}

enum Sex{
    MALE,FEMALE;
}
