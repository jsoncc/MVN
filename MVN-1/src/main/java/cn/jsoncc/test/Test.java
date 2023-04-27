package cn.jsoncc.test;

/**
 * 除法中整形和浮点型区别
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.pow(4, 0.6));

        //0.5555555555555556
        double a = 5.0 / 9;
        //0
        int aa = 5 / 9;
        //68.0
        double b = 68;
        //0.0
        double c = aa * b;
        //37.77777777777778
        double celsius = (5.0 / 9) * (100 - 32);
        System.out.println(c);
    }
}
