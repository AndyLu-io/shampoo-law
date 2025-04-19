package com.shampoo.law.service.thread;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -09 -01:43
 */
public class UserTest2 {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserServiceImpl proxyIml = (UserServiceImpl) cglibProxy.getProxy(UserServiceImpl.class);
        String sayHello = proxyIml.sayHello("luxiaobo222");
        System.out.println(sayHello);
    }
}
