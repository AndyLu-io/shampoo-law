package com.shampoo.law.service.thread.barrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:44
 */
public class MyThread implements Runnable {
    private CyclicBarrier barrier;

    public MyThread(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("ThreadName.currentThread: " + Thread.currentThread().getName() + "is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
