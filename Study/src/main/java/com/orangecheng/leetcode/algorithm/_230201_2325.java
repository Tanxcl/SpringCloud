package com.orangecheng.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName: _230201_2325
 * @description: 解密消息
 * @author: OrangeCheng
 * @create: 2023-02-01 15:25
 **/
public class _230201_2325 {

    /**
     * 给你字符串 key 和 message ，分别表示一个加密密钥和一段加密消息。解密 message 的步骤如下
     *
     * 使用 key 中 26 个英文小写字母第一次出现的顺序作为替换表中的字母 顺序 。
     * 将替换表与普通英文字母表对齐，形成对照表。
     * 按照对照表 替换 message 中的每个字母。
     * 空格 ' ' 保持不变。
     *
     * 例如，key = "happy boy"（实际的加密密钥会包含字母表中每个字母 至少一次），
     * 据此，可以得到部分对照表
     * （'h' -> 'a'、'a' -> 'b'、'p' -> 'c'、'y' -> 'd'、'b' -> 'e'、'o' -> 'f'）。
     *
     */
    public static void main(String[] args) {
        _230201_2325 v = new _230201_2325();
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String s = v.decodeMessage(key, message);
        System.out.println(s);
    }

    /**
     * 76+62
     * v-
     */
    public String decodeMessage(String key, String message) {
        char[] d = new char[128];
        d[' '] = ' ';
        for (int i = 0, j = 0; i < key.length(); ++i) {
            char c = key.charAt(i);
            if (d[c] == 0) {
                d[c] = (char) ('a' + j++);
            }
        }
        char[] ans = message.toCharArray();
        for (int i = 0; i < ans.length; ++i) {
            ans[i] = d[ans[i]];
        }
        return String.valueOf(ans);
    }
}
