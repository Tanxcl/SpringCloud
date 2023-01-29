package com.orangecheng.leetcode.algorithm;

/**
 * @ClassName: _230129_2315
 * @description: 统计星号
 * @author: OrangeCheng
 * @create: 2023-01-29 11:51
 **/
public class _230129_2315 {

    /**
     * 给你一个字符串s，每两个连续竖线'|'为 一对。换言之，第一个和第二个'|'为一对，第三个和第四个'|'为一对，以此类推。
     *
     * 请你返回 不在 竖线对之间，s中'*'的数目。
     *
     * 注意，每个竖线'|'都会 恰好属于一个对。
     *
     * 示例一:
     * 输入：s = "l|*e*et|c**o|*de|"
     * 输出：2
     * 解释：不在竖线对之间的字符加粗加斜体后，得到字符串："l|*e*et|c**o|*de|" 。
     * 第一和第二条竖线 '|' 之间的字符不计入答案。
     * 同时，第三条和第四条竖线 '|' 之间的字符也不计入答案。
     * 不在竖线对之间总共有 2 个星号，所以我们返回 2 。
     *
     * 示例二:
     * 输入：s = "iamprogrammer"
     * 输出：0
     * 解释：在这个例子中，s 中没有星号。所以返回 0 。
     *
     * 示例三:
     * 输入：s = "yo|uar|e**|b|e***au|tifu|l"
     * 输出：5
     * 解释：需要考虑的字符加粗加斜体后："yo|uar|e**|b|e***au|tifu|l" 。不在竖线对之间总共有 5 个星号。所以我们返回 5 。
     *
     */
    public static void main(String[] args) {
        _230129_2315 v = new _230129_2315();
        String s = "l|*e*et|c**o|*de|uu*|";
        int i = v.countAsterisks(s);
        System.out.println(i);
    }

    public int countAsterisks(String s) {   //l|*e*et|c**o|*de|
        char[] chars = s.toCharArray();
        int count = 0;
        boolean flag = true;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '|'){
                flag = !flag;
                continue;
            }else{
                if (flag && chars[i] == '*'){
                    count++;
                }else{
                    continue;
                }
            }
        }
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '|'){
//                flag = !flag;
//                count += a;
//                a = 0;
//                continue;
//            }else{
//                if (!flag && chars[i] == '*'){  //判断是头|，还是尾|
//                    a ++;
//                }else{
//                    continue;
//                }
//            }
//        }
        return count;
    }

}
