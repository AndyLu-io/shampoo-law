package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -15:47
 */
public class MergeStr {


    public String merge(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(length1, length2);
        int minLength = Math.min(length1, length2);
        char[] result = new char[word1.length() + word2.length()];
        for (int i = 0; i < minLength; i++) {
            result[i * 2] = word1.charAt(i);
            result[i * 2 + 1] = word2.charAt(i);
        }
        if (maxLength == minLength) {
            return new String(result);
        } else {
            String maxStr = length1 > length2 ? word1 : word2;
            for (int i = 0; i < maxLength - minLength; i++) {
                result[minLength * 2 + i] = maxStr.charAt(minLength + i);
            }
            return new String(result);

        }
    }

    public String mergeNew(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < length1 || j < length2) {
           if (i <  length1) {
               sb.append(word1.charAt(i));
               i++;

           }
           if (j < length2) {
               sb.append(word2.charAt(j));
               j++;
           }


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeStr mergeStr = new MergeStr();
        String merge = mergeStr.mergeNew("abc", "degfj");
        System.out.println(merge);
    }
}
