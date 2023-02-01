package com.orangecheng.leetcode.algorithm;

/**
 * @ClassName: _230130_1669
 * @description: 合并两个链表
 * @author: OrangeCheng
 * @create: 2023-01-30 11:37
 **/
public class _230130_1669 {

    /**
     * 给你两个链表list1 和list2，它们包含的元素分别为n 个和m 个。
     *
     * 请你将list1中下标从 a 到 b 的全部节点都删除，并将list2接在被删除节点的位置。
     *
     * 示例一:
     * 输入：list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
     * 输出：[0,1,2,1000000,1000001,1000002,5]
     * 解释：我们删除 list1 中下标为 3 和 4 的两个节点，并将 list2 接在该位置。上图中蓝色的边和节点为答案链表。
     *
     * 示例二:
     * 输入：list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
     * 输出：[0,1,1000000,1000001,1000002,1000003,1000004,6]
     * 解释：上图中蓝色的边和节点为答案链表。
     */
    public static void main(String[] args) {
        _230130_1669 v = new _230130_1669();
        int[] list1Array = {0,1,2,3};
        int[] list2Array = {};
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        int a = 0;
        int b = 0;
        for (int i = 0; i < list1Array.length; i++) {
            if (i == 0){
                list1.val = list1Array[i];
            }
            ListNode listNode = new ListNode();
            list1.next = listNode;
        }


        ListNode listNode = v.mergeInBetween(list1, a, b, list2);
    }

    //list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode result = new ListNode();
        while(list1.next == null){
            a--;
            b--;
            if (a < 0 && b != 0){
                continue;
            }else if (b == 0){
                while(result.next == null){
                    result.next = list2;
                }
                break;
            }else{
                while(result.next == null){
                    ListNode node = new ListNode(list1.val);
                    result.next = node;
                }
            }
        }
        return result;
    }

}

class ListNode {

    int val;
    ListNode next;

    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
