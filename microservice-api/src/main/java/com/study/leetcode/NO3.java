package com.study.leetcode;

/**
 * @className: NO3
 * @description: TODO 无重复字符的最长子串
 * @author: Txc
 * @date: 2023/1/12 15:26
 **/
public class NO3 {

    /**
     * 给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
     *
     * 示例一：
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * 示例二：
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     */
    public static void main(String[] args) {
        NO3 no3 = new NO3();
        String s = "abcabcbb";
        int i = no3.lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
