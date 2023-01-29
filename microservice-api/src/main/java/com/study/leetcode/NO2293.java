package com.study.leetcode;

/**
 * @className: NO2293
 * @description: TODO 极大极小游戏
 * @author: Txc
 * @date: 2023/1/15 15:52
 **/
public class NO2293 {

    /**
     * 给你一个下标从 0 开始的整数数组 nums ，其长度是 2 的幂。1
     *
     * 对 nums 执行下述算法：
     *
     *     设 n 等于 nums 的长度，如果 n == 1 ，终止 算法过程。否则，创建 一个新的整数数组newNums ，新数组长度为 n / 2 ，下标从 0 开始。
     *     对于满足0 <= i < n / 2 的每个 偶数 下标 i ，将 newNums[i] 赋值 为 min(nums[2 * i], nums[2 * i + 1]) 。
     *     对于满足0 <= i < n / 2 的每个 奇数 下标 i ，将 newNums[i] 赋值 为 max(nums[2 * i], nums[2 * i + 1]) 。
     *     用 newNums 替换 nums 。
     *     从步骤 1 开始 重复 整个过程。
     *
     * 执行算法后，返回 nums 中剩下的那个数字。
     */
    public static void main(String[] args) {
        int[] nums = {7,5,4,4,8,6,1,2};
        NO2293 no2293 = new NO2293();
        int i = no2293.minMaxGame(nums);
        System.out.println(i);
    }
    // 1542 14 1    5,4,6,2 46 4
    public int minMaxGame(int[] nums) {
        int num = nums.length/2;
        int[] a = new int[nums.length/2];
        int index = 0;
        while (num != index){
            if (index %2 == 0){
                a[index] = compare(nums[2*index],nums[2*index+1],index);
            }else{
                a[index] = compare(nums[2*index],nums[2*index+1],index);
            }
            if (index == num-1){
                index = 0;
                nums = a;
                if (num == 1){
                    num = 0;
                }else{
                    num = num - num/2;
                }
            }else{
                index ++ ;
            }
        }
        return nums[0];
    }

    public int compare(int a, int b, int index){
        if (index%2 == 0){
            if (a>b){
                return b;
            }else{
                return a;
            }
        }else{
            if (a>b){
                return a;
            }else{
                return b;
            }
        }
    }
}
