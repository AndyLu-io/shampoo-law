package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -16:11
 */
public class StrCommonDivior {

    public String CommonStr(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        String minStr = len1 < len2 ? word1 : word2;
        String result = "";
        for (int i = minStr.length(); i > 0; i--) {
            if (len1 % i == 0 && len2 % i == 0) {
                String subStr = minStr.substring(0, i);
                if (isSubStr(word1, subStr) && isSubStr(word2, subStr)) {
                    result =  subStr;
                }
            }
        }
        return result;

    }

    private boolean isSubStr(String orgStr, String subStr) {
        int num = orgStr.length() / subStr.length();
        int gap = subStr.length();
        for (int i = 0; i < num; i++) {
            String testStr = orgStr.substring(0 + i * gap, gap + i * gap);
            if (!testStr.equals(subStr)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StrCommonDivior strCommonDivior = new StrCommonDivior();
        String commonStr = strCommonDivior.CommonStr("ABABABAB", "ABAB");
        System.out.println(commonStr);
    }
}
