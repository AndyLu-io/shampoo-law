package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -17 -20:10
 */
public class rob {

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[n - 1]);
        }
        return dp[n];

    }
}
