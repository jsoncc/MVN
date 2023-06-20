package cn.jsoncc.demo.oop;

/**
 * @author JsonCC
 * @date 2023/6/19 10:29
 * @desc
 */

interface MyInterface {
    void performAction(int value);
}

public class LambdaMain {
    public static void main(String[] args) {
        // 使用匿名类创建函数式接口的实现
        MyInterface myInterface = new MyInterface() {
            @Override
            public void performAction(int value) {
                System.out.println("Doing something：" + value);

            }
        };
        myInterface.performAction(11);
    }

    public static void main1(String[] args) {
        // 使用lambda表达式创建函数式接口的实现
        MyInterface myInterface = (value) -> System.out.println("Performing action with value: " + value);
        myInterface.performAction(42);
    }
}

