package com.shampoo.law.service.suanfa;

import java.util.Arrays;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -15 -16:57
 */
public class maxOperation {
    public int maxOperations(int[] nums, int k) {
        int[] sortedArray = Arrays.stream(nums).sorted().toArray();
        int size = nums.length;
        int ans = 0;
        int left = 0, right = size -1;
        while (left < right) {
            if (sortedArray[left] + sortedArray[right] == k) {
                ans++;
                left++;
                right--;
            } else if (sortedArray[left] + sortedArray[right]  < k) {
                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}
