package com.shampoo.law.service.ood.singleton;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -12:05
 */
public class HolderSingleton {
    private HolderSingleton() {
    }

    private static class Holder {
        private static final HolderSingleton instance = new HolderSingleton();
    }

    public static final HolderSingleton getInstance() {
        return Holder.instance;
    }
}
