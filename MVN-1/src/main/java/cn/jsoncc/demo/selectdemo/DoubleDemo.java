package cn.jsoncc.demo.selectdemo;

public class DoubleDemo {
    public static void main(String[] args) {
        double a = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        double b = 1.0 - 0.1 - 0.1;
        //false
        System.out.println(a == 0.5);
        //true
        System.out.println(b == 0.8);
    }
}
