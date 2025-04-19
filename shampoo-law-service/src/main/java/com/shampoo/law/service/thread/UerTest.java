package com.shampoo.law.service.thread;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -09 -01:35
 */
public class UerTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvokeHandler myInvokeHandler = new MyInvokeHandler(userService);
        UserService proxy = (UserService) myInvokeHandler.getProxy();
        String sayHello = proxy.sayHello("luxiaobo");
        System.out.println(sayHello);
    }
}
