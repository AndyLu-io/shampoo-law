package com.shampoo.law.service.thread;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -09 -01:32
 */
public class UserServiceImpl  implements UserService{
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
