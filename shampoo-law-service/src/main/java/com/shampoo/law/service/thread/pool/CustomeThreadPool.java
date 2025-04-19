package com.shampoo.law.service.thread.pool;

import com.shampoo.law.service.thread.barrier.MyThread;

import java.util.concurrent.*;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -27 -23:36
 */
public class CustomeThreadPool {

    private static  int corePoolSize = 5;

    private static  int maxPoolSize = 10;

    private static  long aliveTime = 60L;

    private static TimeUnit timeUnit = TimeUnit.SECONDS;

    private  static BlockingDeque<Runnable> blockingDeque = new LinkedBlockingDeque(5);

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                aliveTime,
                timeUnit,
                blockingDeque,
                new CustomThreadFactory(),
                new CustomRejectionHandler()
        );
        for (int i = 0; i < 200; i++) {
            executor.submit(
                    () -> {
                        System.out.println("task execute by"+ Thread.currentThread().getName()) ;
                    }
            );
        }
        executor.shutdown();

    }
}
