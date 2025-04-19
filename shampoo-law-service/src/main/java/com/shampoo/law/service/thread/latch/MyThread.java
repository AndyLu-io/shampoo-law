package com.shampoo.law.service.thread.latch;

import java.util.concurrent.CountDownLatch;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:34
 */
public class MyThread implements Runnable{
    private CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("ThreadName.currentThread: " + Thread.currentThread().getName() + "is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
    }
}
