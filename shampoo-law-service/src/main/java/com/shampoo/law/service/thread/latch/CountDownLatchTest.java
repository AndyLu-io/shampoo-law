package com.shampoo.law.service.thread.latch;

import java.util.concurrent.CountDownLatch;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:36
 */
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        CountDownLatch latch2 = new CountDownLatch(1);
        CountDownLatch latch3 = new CountDownLatch(1);

        Thread t1 = new Thread(new MyThread(latch), "T1");
        t1.start();
        latch.await();
        Thread t2 = new Thread(new MyThread(latch2), "T2");
        t2.start();
        latch2.await();
        Thread t3 = new Thread(new MyThread(latch3), "T3");
        t3.start();
        latch3.await();

    }
}
