package com.shampoo.law.service.thread;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -09 -01:33
 */
public class MyInvokeHandler implements InvocationHandler {


    private Object target;

    public MyInvokeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        return result;
    }

    public Object getProxy() {
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
