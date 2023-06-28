package cn.jsoncc.demo.random;

import cn.jsoncc.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author JsonCC
 * @date 2023/6/28 10:06
 * @desc
 */


public class RandomDataGenerator {
    public static void main(String[] args) {
        List<User> people = generateRandomPeople(10);
    }
    public static List<User> generateRandomPeople(int count) {
        List<User> people = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            User person = new User();
            person.setName("Name " + i);
            person.setAge(BigDecimal.valueOf(random.nextInt(100)));
            people.add(person);
        }
        return people;

    }
}