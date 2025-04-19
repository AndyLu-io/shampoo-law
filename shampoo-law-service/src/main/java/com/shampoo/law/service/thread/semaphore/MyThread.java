package com.shampoo.law.service.thread.semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:50
 */
public class MyThread implements Runnable{
    private Semaphore semaphore;

    public MyThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("ThreadName.currentThread: " + Thread.currentThread().getName() + "is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
