package com.shampoo.law.service.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -17:39
 */
public class reverseVowels {

    public String reverseVowels(String s) {
        char[] result = new char[s.length()];
        char[] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};
        List<char[]> list = Arrays.asList(vowels);
        char[] charArray = s.toCharArray();
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0 ; i < charArray.length; i++) {
          for (int j = 0; j < vowels.length; j++) {
              if (charArray[i] == vowels[j]) {
                  indexList.add(i);
              }
          }
        }
       for (int i = 0; i < charArray.length; i++) {
           if (indexList.contains(i)) {
               result[i] = charArray[indexList.get(indexList.size() - 1)];
               indexList.remove(indexList.size() - 1);
           } else {
               result[i] = charArray[i];
           }

       }

       return new String(result);

    }
}
