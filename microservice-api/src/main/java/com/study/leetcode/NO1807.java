package com.study.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: NO1807
 * @description: TODO 替换字符串中的括号内容
 * @author: Txc
 * @date: 2023/1/12 13:25
 **/
public class NO1807 {

    /**
     * 给你一个字符串s，它包含一些括号对，每个括号中包含一个 非空的键。
     *
     * 比方说，字符串"(name)is(age)yearsold"中，有两个括号对，分别包含键"name" 和"age"。
     *
     * 你知道许多键对应的值，这些关系由二维字符串数组knowledge表示，其中knowledge[i] = [keyi, valuei]，表示键keyi对应的值为valuei。
     *
     * 你需要替换 所有的括号对。当你替换一个括号对，且它包含的键为keyi时，你需要：
     *
     * 将keyi和括号用对应的值valuei替换。
     * 如果从 knowledge中无法得知某个键对应的值，你需要将keyi和括号用问号"?"替换（不需要引号）。
     *
     * knowledge中每个键最多只会出现一次。s中不会有嵌套的括号。
     *
     * 请你返回替换 所有括号对后的结果字符串。
     */
    public static void main(String[] args) {
        NO1807 no1807 = new NO1807();
        List<List<String>> list = new ArrayList<>();
        List<String> inOne = new ArrayList<>();
        inOne.add("name");
        inOne.add("bob");
        List<String> inTwo = new ArrayList<>();
        inTwo.add("age");
        inTwo.add("two");
        list.add(inOne);
        list.add(inTwo);

        String evaluate = no1807.evaluate("(name)is(age)yearsold", list);
        System.out.println(evaluate);
    }

    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            char a = s.charAt(index);
            if (a == '(') {
                StringBuilder sb1 = new StringBuilder();
                index++;
                while (s.charAt(index) != ')') {
                    sb1.append(s.charAt(index));
                    index++;
                }
                if (map.containsKey(sb1.toString())) {
                    sb.append(map.get(sb1.toString()));
                } else {
                    sb.append('?');
                }
            } else {
                sb.append(a);
            }
            index++;
        }
        return sb.toString();
    }
}
