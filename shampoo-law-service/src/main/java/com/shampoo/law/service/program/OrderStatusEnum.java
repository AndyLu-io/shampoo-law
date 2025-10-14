package com.shampoo.law.service.program;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -04 -20 -00:55
 */
public enum OrderStatusEnum {
    ;

    private int code;

    private String name;

    OrderStatusEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderStatusEnum getEnumByCode(int code) {
        for (OrderStatusEnum orderStatusEnum : OrderStatusEnum.values()) {
            if (orderStatusEnum.getCode() == code) {
                return orderStatusEnum;
            }
        }
        return null;
    }



}
