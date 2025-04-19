package com.shampoo.law.service.thread;

/**
 * @author luxiaobo
 * @Description
 * @create 2024 -10 -31 -23:37
 */
public class MainThread {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println("当前线程名称：" + name);
        thread.setName("MainThread");
        String name1 = thread.getName();
        System.out.println("当前线程名称：" + name1);
    }
}
