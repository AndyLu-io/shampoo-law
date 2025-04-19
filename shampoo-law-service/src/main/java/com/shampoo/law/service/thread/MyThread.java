package com.shampoo.law.service.thread;

/**
 * @author luxiaobo
 * @Description
 * @create 2024 -10 -31 -23:38
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("MyThread.run()" + Thread.currentThread().getName());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("MainThread.run()" + myThread.getName());
    }

}
