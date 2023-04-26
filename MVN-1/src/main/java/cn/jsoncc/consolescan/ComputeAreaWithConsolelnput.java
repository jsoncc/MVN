package cn.jsoncc.consolescan;

import java.util.Scanner;

public class ComputeAreaWithConsolelnput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入半径：");
        double r = sc.nextDouble();
        System.out.println("圆的面积为：" + 3.14 * r * r);

    }
}
