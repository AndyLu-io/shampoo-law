package com.shampoo.law.service.thread;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -10 -21:43
 */
public class StringTest {

    public static void main(String[] args) {
        String s = "aa";
        String s3 = new String("a") + new String("a");
        s3 = s3.intern();
        String s4 = "aa";
        System.out.println(s3 == s4);
    }
}
