package com.shampoo.law.service.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -28 -00:09
 */
public class newScheduledThreadPoolTest {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        System.out.println(111);
        scheduledExecutorService.scheduleAtFixedRate(
                () -> {
                    System.out.println("hello:" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000); // 模拟任务执行时间
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                },
                1,
                2, TimeUnit.SECONDS);
//        for (int i = 0; i < 3; i++) {
//
//        }


        scheduledExecutorService.shutdown();
    }
}



