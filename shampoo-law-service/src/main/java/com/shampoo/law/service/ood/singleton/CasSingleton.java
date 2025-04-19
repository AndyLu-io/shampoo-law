package com.shampoo.law.service.ood.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -12:07
 */
public class CasSingleton {

    private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<>();

    private CasSingleton() {
    }

    public static  CasSingleton getInstance() {
       for (;;) {
            CasSingleton instance = INSTANCE.get();
            if (instance != null) {
                return instance;
            }
            instance = new CasSingleton();
            if (INSTANCE.compareAndSet(null, instance)) {
                return instance;
            }
        }
    }
}
