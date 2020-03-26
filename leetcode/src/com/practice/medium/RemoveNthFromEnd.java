package com.practice.medium;


/**
 * NO.19 删除链表的倒数第N个节点
 * Created by liaoyilang on 26/03/2020.
 */
public class RemoveNthFromEnd {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        int n = 2;

        ListNode node = removeNthFromEnd(head, n);

    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;


    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
