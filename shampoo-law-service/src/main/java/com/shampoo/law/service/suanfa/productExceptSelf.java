package com.shampoo.law.service.suanfa;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -13 -18:04
 */
public class productExceptSelf {
    //假如nums为[1,2,3,4]，那么answer的值分别为[(2,3,4),(1,3,4),(1,2,4),(1,2,3)]
    //如果吧i当前值相乘的时候看做是1那么就有如下样式
    //  1, 2, 3, 4
    //  1, 1, 3, 4
    //  1, 2, 1, 4
    //  1, 2, 3, 1
    // 他的对角线1将他们分割成了两个三角形，对于answer的元素，
    //我们可以先计算一个三角形每行的乘积，然后再去计算另外一个三角形每行的乘积，
    //然后各行相乘，就是answer每个对应的元素
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        //先初始化一个answer数组,但是很多解答都没说明的是这个answer数组，
        //并不是以此计算就得出的结果,而是两次乘积之后的结果
        int[] answer = new int[length];
        //初始化一个初始值，作为三角乘积计算的开始
        answer[0] = 1;
        //先计算左边三角的乘积
        for(int i = 1; i < length; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        //再次计算右边三角形,为什么是length-2呢？
        //length-1是最后一个值的索引，但是最后一个值temp[length-1] = 1,
        //也是对应对角线上的1，所以不在进行相乘处理
        //temp的作用是计算右边三角形的乘积的累计值，然后再和answer相乘，
        //注意!!!:不能直接nums[i+1]相乘那会在计算右三角的时候变成每行乘积与nums[i+1]的错误答案
        int temp = 1;
        for(int i = length - 2; i >= 0; i--){
            //先将每行乘积赋予一个中间值
            temp *= nums[i+1];
            answer[i] *= temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        productExceptSelf productExceptSelf = new productExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] ints = productExceptSelf.productExceptSelf(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
