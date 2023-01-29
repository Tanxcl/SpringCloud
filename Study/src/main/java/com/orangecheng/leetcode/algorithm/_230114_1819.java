package com.orangecheng.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @className: NO1819
 * @description: TODO 序列中不同最大公约数的数目
 * @author: Txc
 * @date: 2023/1/14 8:42
 **/
public class _230114_1819 {

    /**
     * 给你一个由正整数组成的数组 nums 。
     *
     * 数字序列的 最大公约数 定义为序列中所有整数的共有约数中的最大整数。
     *
     *     例如，序列 [4,6,16] 的最大公约数是 2 。
     *
     * 数组的一个 子序列 本质是一个序列，可以通过删除数组中的某些元素（或者不删除）得到。
     *
     *     例如，[2,5,10] 是 [1,2,1,2,4,1,5,10] 的一个子序列。
     *
     * 计算并返回 nums 的所有 非空 子序列中 不同 最大公约数的 数目
     */
    public static void main(String[] args) {
        _230114_1819 no1819 = new _230114_1819();
        int[] nums = {6,10,3};
        no1819.countDifferentSubsequenceGCDs(nums);
    }

    public int countDifferentSubsequenceGCDs(int[] nums) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("a");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
//            set.iterator().next();
            System.out.println(iterator.next());
//            set.iterator().remove();
        }
        return 1;
    }

    public int countDifferentSubsequenceGCDsOne(int[] nums) {
        int maxVal = Arrays.stream(nums).max().getAsInt();
        boolean[] occured = new boolean[maxVal + 1];
        for (int num : nums) {
            occured[num] = true;
        }
        int ans = 0;
        for (int i = 1; i <= maxVal; i++) {
            int subGcd = 0;
            for (int j = i; j <= maxVal; j += i) {
                if (occured[j]) {
                    if (subGcd == 0) {
                        subGcd = j;
                    } else {
                        subGcd = gcd(subGcd, j);
                    }
                    if (subGcd == i) {
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }
}
