package cn.jsoncc.enums;

/**
 * @author JsonCC
 * @date 2023/5/5 9:56
 * @desc 数字枚举，消除魔法值
 */
public enum NumberEnum {
    //数字枚举
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    NumberEnum(Integer code) {
        this.code = code;
    }
}
