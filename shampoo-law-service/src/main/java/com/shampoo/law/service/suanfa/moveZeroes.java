package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -16 -00:40
 */
public class moveZeroes {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0, j = 0;
        while (j < length) {
            if (nums[j] != 0) {
                swap(nums, i, j);
                i++;
            }
            j ++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
