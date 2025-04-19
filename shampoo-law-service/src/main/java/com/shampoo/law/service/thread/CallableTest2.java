package com.shampoo.law.service.thread;

import java.util.concurrent.*;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -11 -11:12
 */
public class CallableTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> {
            System.out.println("callable");
            return "callable";
        };
        System.out.println("submit call");
        Future<String> submit = executorService.submit(callable);
        System.out.println("main");
        System.out.println("submit.get() = " + submit.get());
        executorService.shutdown();

    }
}
