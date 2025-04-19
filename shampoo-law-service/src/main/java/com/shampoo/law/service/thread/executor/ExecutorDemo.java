package com.shampoo.law.service.thread.executor;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -15:51
 */
public class ExecutorDemo {

    private static ThreadFactory namedThreadFactory  = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();

    private static ExecutorService pool = new ThreadPoolExecutor(5, 200, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.DiscardPolicy());
    public static void main(String[] args) {
        for (int i = 0; i< Integer.MAX_VALUE; i++) {

            pool.execute(new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }));
        }
    }
}
