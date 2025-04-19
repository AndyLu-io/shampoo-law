package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -19:12
 */
public class compressChar {
    public int compress(char[] chars) {
        // 双指针问题 一个控制读取的位置 一个控制写入
        int p = 0, q = 0, n = chars.length;
        while (q < n) {
            char cur = chars[q];
            int cnt = 0;
            while (q < n && chars[q] == cur) {
                cnt++;
                q++;
            }
            chars[p++] = cur;
            if (cnt != 1) {
                // 将的到的数字挨个写入
                char[] counter = (cnt + "").toCharArray();
                for (char c : counter)
                    chars[p++] = c;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        compressChar compressChar = new compressChar();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int compress = compressChar.compress(chars);
        System.out.println(compress);
    }
}
