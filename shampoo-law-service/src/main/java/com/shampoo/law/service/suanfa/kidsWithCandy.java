package com.shampoo.law.service.suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -16:33
 */
public class kidsWithCandy {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for (int i : candies) {
            max = Math.max(max, i);
        }
        for (int i : candies) {
            result.add(i + extraCandies >= max);
        }

        return result;
    }
}
