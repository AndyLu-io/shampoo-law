package com.shampoo.law.service.thread.pool;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:54
 */
public class MyThread implements Runnable {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("ThreadName.currentThread: " + this.name+ "is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
