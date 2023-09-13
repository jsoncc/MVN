package cn.jsoncc.demo.list;

import java.util.LinkedList;

/**
 * @author JsonCC
 * @date 2023/9/13 16:10
 * @desc
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> tech = new LinkedList<String>();
        tech.add("Java");
        tech.add("SQL");
        tech.add("Redis");
        System.out.println(tech);
    }
}
