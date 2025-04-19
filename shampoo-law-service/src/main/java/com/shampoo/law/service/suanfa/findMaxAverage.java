package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -16 -00:57
 */
public class findMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        double ans =getAvg(nums, i, k);
        while (i + k <= n) {
            ans = Math.max(ans, getAvg(nums, i, k));
            i++;
        }
        return ans;
    }

    private double getAvg(int[] nums, int i, int k) {
        int j = 0;
        int sum = 0;
        for (int a = 1; a <= k; a++) {
            sum += nums[i];
            i++;
        }
        return sum / (k * 1.00) ;
    }

    public static void main(String[] args) {
        findMaxAverage f  = new findMaxAverage();
        int[] nums = new int[]{-1};
        double maxAverage = f.findMaxAverage(nums, 1);
        System.out.println(maxAverage);
    }
}
