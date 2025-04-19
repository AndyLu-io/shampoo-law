package com.shampoo.law.service.thread.pool;

import java.util.concurrent.ThreadFactory;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -28 -00:02
 */
public class CustomThreadFactory implements ThreadFactory {
    private int counter = 0;
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("CustomThread-name-" + counter++);
        return thread;
    }
}
