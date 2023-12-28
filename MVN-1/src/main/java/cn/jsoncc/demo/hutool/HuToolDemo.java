package cn.jsoncc.demo.hutool;

import cn.hutool.core.util.RandomUtil;

/**
 * @author JsonCC
 * @date 2023/12/28 13:31
 * @desc
 */
public class HuToolDemo {
    public static void main(String[] args) {
        // 生成 4 位随机验证码
        String verificationCode = RandomUtil.randomStringUpper(4);
        System.out.println(verificationCode);
    }
}
