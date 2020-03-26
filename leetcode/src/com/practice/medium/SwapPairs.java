package com.practice.medium;


/**
 * NO.24 两两交换链表中的节点
 * Created by liaoyilang on 26/03/2020.
 */
public class SwapPairs {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        int n = 2;

        ListNode node = swapPairs(head);

    }

    private static ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

}


