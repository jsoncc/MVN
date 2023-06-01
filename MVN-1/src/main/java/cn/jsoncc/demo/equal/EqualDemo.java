package cn.jsoncc.demo.equal;

import lombok.*;

/**
 * @author JsonCC
 * @date 2023/5/22 16:55
 * @desc ==和equals的比较，使用 == 运算符比较的是对象的引用地址，而不是对象的内容
 */
public class EqualDemo {
    public static void main(String[] args) {
        EqualDemo equalDemo = new EqualDemo();
        equalDemo.getPerson();
    }

    public void getPerson() {
        Person p1 = getPerson1();
        Person p2 = getPerson2();
        System.out.println("两个有相同值的对象（==比较）：" + (p1 == p2));
        System.out.println("两个有相同值的对象（equals比较）：" + (p1.equals(p2)));
    }

    public Person getPerson1() {
        Person person = new Person();
        person.setName("hhh");
        person.setAge(12);
        return person;
    }

    public Person getPerson2() {
        Person person = new Person();
        person.setName("hhh");
        person.setAge(12);
        return person;
    }
}

@AllArgsConstructor
@Getter
@Setter
@Data
@NoArgsConstructor
class Person {
    private String name;
    private Integer age;
}

