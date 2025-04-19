package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -17:58
 */
public class reverseWords {
    public String reverseWords(String s) {
        String trim = s.trim();
        String[] split = trim.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].equals("")) {
                continue;
            }
            sb.append(split[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
