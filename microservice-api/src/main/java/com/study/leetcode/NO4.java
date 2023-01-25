package com.study.leetcode;

import java.util.Arrays;

/**
 * @className: NO4
 * @description: TODO 寻找两个正序数组的中位数
 * @author: Txc
 * @date: 2023/1/12 14:26
 **/
public class NO4 {

    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
     *
     * 算法的时间复杂度应该为 O(log (m+n)) 。
     *
     * 示例一：
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     */
    public static void main(String[] args) {
        NO4 no4 = new NO4();
        int[] a = {1,2};
        int[] b = {3};
        no4.findMedianSortedArrays(a,b);
    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, result,nums1.length,nums2.length);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        return 1.0;
    }
}
