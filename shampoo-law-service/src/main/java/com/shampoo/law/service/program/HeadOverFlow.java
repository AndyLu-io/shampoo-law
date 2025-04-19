package com.shampoo.law.service.program;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -19 -17:28
 */
public class HeadOverFlow {

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        while (true) {
            objectList.add(new Object());
        }
    }
}
