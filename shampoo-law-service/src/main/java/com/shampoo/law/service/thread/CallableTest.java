package com.shampoo.law.service.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:09
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> {
            System.out.println("callable");
            return "callable";
        };
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("main");
        System.out.println("futureTask.get() = " + futureTask.get());

    }
}
