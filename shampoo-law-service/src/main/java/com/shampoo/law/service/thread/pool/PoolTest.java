package com.shampoo.law.service.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:55
 */
public class PoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i< 10;i++) {

            executorService.submit(new MyThread("T1"));
            executorService.submit(new MyThread("T2"));
            executorService.submit(new MyThread("T3"));
        }


    }
}
