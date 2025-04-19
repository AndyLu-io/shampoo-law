package com.shampoo.law.service.thread.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:52
 */
public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(1);

        semaphore.acquire();

        Thread t1 = new Thread(new MyThread(semaphore), "T1");
        t1.start();

        semaphore.acquire();
        Thread t2 = new Thread(new MyThread(semaphore), "T2");
        t2.start();

        semaphore.acquire();
        Thread t3 = new Thread(new MyThread(semaphore), "T3");
        t3.start();
    }
}
