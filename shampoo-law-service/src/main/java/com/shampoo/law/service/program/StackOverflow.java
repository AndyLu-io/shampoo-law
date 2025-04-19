package com.shampoo.law.service.program;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -19 -17:30
 */
public class StackOverflow {

    public static void main(String[] args) {
        digui(1);
    }

    private static void digui(int i) {
        digui(i);
    }
}
