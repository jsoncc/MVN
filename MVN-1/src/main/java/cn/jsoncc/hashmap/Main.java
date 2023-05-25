package cn.jsoncc.hashmap;

import java.util.HashMap;
import java.util.Optional;

/**
 * @author JsonCC
 * @date 2023/5/25 16:38
 * @desc hashcode()方法
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(new String("sss"), "hhh");
        map.put(new String("sss"), "aaa");
        // map里只有一个数据，因为String重写了equals方法和hashcode方法，所以key属性值一样的会被覆盖
        System.out.println(map.size()); // 1
        HashMap<Person, String> map1 = new HashMap<>();
        Person p1 = new Person("xiao", 15);
        map1.put(p1, "ok");
        Person p2 = new Person("xiao", 15);
        map1.put(p2, "hao");
        // map现在也只有一个数据了，因为两个相同属性的对象被视作同一个
        System.out.println(map1.size()); // 1
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 覆写equals方法
    //jdk16写法
//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof Person p) {
//            return this.name.equals(p.name) && this.age == p.age;
//        }
//        return false;
//    }
    @Override
    public boolean equals(Object o) {
        return Optional.ofNullable(o)
                .filter(Person.class::isInstance)
                .map(Person.class::cast)
                .map(p -> this.name.equals(p.name) && this.age == p.age)
                .orElse(false);
    }


    // 覆写hashcode方法
    @Override
    public int hashCode() {
        int h = 0;
        h = 31 * h + name.hashCode();
        h = 31 * h + age;
        return h;
    }
}

