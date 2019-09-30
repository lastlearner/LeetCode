package com.practice.medium;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.simple
 * @ClassName: AddTwoNumbers
 * @Author: liaoyilang
 * @Description: ${description}
 * @Date: 2019/9/30 下午5:13
 * @Version: 1.0
 */
public class AddTwoNumbers {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        addTwoNumbers(l1,l2);
    }

    private static int addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null){
            return 0;
        }
        if(l1 == null && l2 != null){

        }
        if(l1 != null && l2 == null){

        }

        if(l1 != null && l2 != null){

        }
        return 0;
    }


    static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int x){
            val = x;
        }
    }
}
