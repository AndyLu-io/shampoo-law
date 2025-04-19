package com.shampoo.law.service.thread;

/**
 * @author luxiaobo
 * @Description
 * @create 2024 -10 -31 -23:42
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("myThread.run()" + myThread.getName());
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("MainThread.run()" + Thread.currentThread().getName());
        }
    }
}
