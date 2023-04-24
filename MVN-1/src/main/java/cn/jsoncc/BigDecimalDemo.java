package cn.jsoncc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double val = 1.12467;
        BigDecimal b = new BigDecimal(val);
        System.out.println("double转BigDecimal: "+b);
        BigDecimal b1 = BigDecimal.valueOf(val);
        System.out.println("valueOf()的值b1: "+b1);
        String numberStr = "123.456789";
        BigDecimal number = new BigDecimal(numberStr);
        System.out.println("String转BigDecimal: "+number);

        BigDecimal divide = b1.divide(number, 6, RoundingMode.DOWN);
        System.out.println("divide: "+divide);


    }
}
