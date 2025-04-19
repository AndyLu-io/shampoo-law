package com.shampoo.law.service.ood.singleton;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -12:02
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
