package com.study.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: NO2287
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2023/1/13 21:01
 **/
public class NO2287 {

    /**
     * 给你两个下标从 0 开始的字符串 s 和 target 。你可以从 s 取出一些字符并将其重排，得到若干新的字符串。
     *
     * 从 s 中取出字符并重新排列，返回可以形成 target 的 最大 副本数。
     *
     * 示例一：
     * 输入：s = "ilovecodingonleetcode", target = "code"
     * 输出：2
     * 解释：
     * 对于 "code" 的第 1 个副本，选取下标为 4 、5 、6 和 7 的字符。
     * 对于 "code" 的第 2 个副本，选取下标为 17 、18 、19 和 20 的字符。
     * 形成的字符串分别是 "ecod" 和 "code" ，都可以重排为 "code" 。
     * 可以形成最多 2 个 "code" 的副本，所以返回 2 。
     *
     * 示例二：
     * 输入：s = "abcba", target = "abc"
     * 输出：1
     * 解释：
     * 选取下标为 0 、1 和 2 的字符，可以形成 "abc" 的 1 个副本。
     * 可以形成最多 1 个 "abc" 的副本，所以返回 1 。
     * 注意，尽管下标 3 和 4 分别有额外的 'a' 和 'b' ，但不能重用下标 2 处的 'c' ，所以无法形成 "abc" 的第 2 个副本。
     *
     * 示例三：
     * 输入：s = "abbaccaddaeea", target = "aaaaa"
     * 输出：1
     * 解释：
     * 选取下标为 0 、3 、6 、9 和 12 的字符，可以形成 "aaaaa" 的 1 个副本。
     * 可以形成最多 1 个 "aaaaa" 的副本，所以返回 1 。
     */
    public static void main(String[] args) {
        NO2287 no2287 = new NO2287();
        String s = "abbaccaddaeea";
        String target = "aaaaa";
        int i = no2287.rearrangeCharactersOne(s, target);
        System.out.println(i);
    }

    public int rearrangeCharacters(String s, String target) {
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (target.contains(chars[i]+"")){
                stringBuffer.append(chars[i]);
            }
        }
        return count;
    }

    public int rearrangeCharactersOne(String s, String target) {
        Map<Character, Integer> sCounts = new HashMap<Character, Integer>();
        Map<Character, Integer> targetCounts = new HashMap<Character, Integer>();
        int n = s.length(), m = target.length();
        for (int i = 0; i < m; i++) {
            char c = target.charAt(i);
            targetCounts.put(c, targetCounts.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (targetCounts.containsKey(c)) {
                sCounts.put(c, sCounts.getOrDefault(c, 0) + 1);
            }
        }
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : targetCounts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            int totalCount = sCounts.containsKey(c) ? sCounts.get(c) : 0;
            ans = Math.min(ans, totalCount / count);
            if (ans == 0) {
                return 0;
            }
        }
        return ans;
    }

}
