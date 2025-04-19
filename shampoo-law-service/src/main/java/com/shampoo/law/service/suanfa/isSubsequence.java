package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -16 -00:29
 */
public class isSubsequence {

    public boolean isSubsequence(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if (sl > tl) {
            return false;
        }
        if (sl == tl) {
            return s.equals(t);
        }
        int i = 0, j = 0;
        while (j <  tl && i < sl) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
            }
            j++;
        }
        return i == sl;
    }
}
