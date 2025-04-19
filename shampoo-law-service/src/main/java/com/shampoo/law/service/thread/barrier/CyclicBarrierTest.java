package com.shampoo.law.service.thread.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:45
 */
public class CyclicBarrierTest {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        // 创建CyclicBarrier对象
        Runnable barrierAction = () -> System.out.println("all thread is ready");
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, barrierAction);
        // 创建线程
        Thread thread1 = new Thread(new MyThread(cyclicBarrier), "Thread1");
        thread1.start();
        cyclicBarrier.await();
        System.out.println("main thread await");
        Thread thread2 = new Thread(new MyThread(cyclicBarrier), "Thread2");
        thread2.start();
//        cyclicBarrier.await();
        Thread thread3 = new Thread(new MyThread(cyclicBarrier), "Thread3");
        thread3.start();
//        cyclicBarrier.await();

    }
}
