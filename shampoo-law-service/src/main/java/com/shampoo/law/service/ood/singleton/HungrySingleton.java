package com.shampoo.law.service.ood.singleton;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -12:01
 */
public class HungrySingleton {

    public static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public  static HungrySingleton getInstance() {
        return instance;
    }
}
