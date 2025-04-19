package com.shampoo.law.service.ood.singleton;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -12:01
 */
public class DoubleCheck {

    private static volatile DoubleCheck instance;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
