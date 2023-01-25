package com.study.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @className: NO1
 * @description: TODO 两数之和
 * @author: Txc
 * @date: 2022/12/16 11:32
 **/
public class NO1 {
    /**
     * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值 target 的那两个整数，并返回它们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     * 你可以按任意顺序返回答案。
     *
     * 示例:
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     *
     */
    public static void main(String[] args){
        int[] ints = NO1.twoSum(new int[]{3,2,4}, 6);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    /**
     * 暴力解法
     */
    public static int[] twoSum(int[] nums, int target){
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j>=0; j--){
                if (nums[i]+nums[j] == target && i != j){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }

    /**
     * 使用HashMap解法
     */
    public int[] twoSumHashMap(int[] nums, int target) {
        int[] indexs = new int[2];
        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(target-nums[i],i);
        }
        return indexs;
    }

    /**
     * 使用ArrayList解法
     */
    public int[] twoSumArray(int[] nums, int target) {
        int[] res = new int[2];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                res[0]=list.indexOf(nums[i]);
                res[1]=i;
            }
            list.add(target-nums[i]);
        }
        return res;
    }

}
