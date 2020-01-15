package com.practice.simple;

/**
 * @Description: NO.21 合并两个有序链表
 * @Auther: liaoyl
 * @Date: 2020/1/16 0016 01:24
 */
public class MergeTwoLists
{
    public static void main(String[] args)
    {

        //[1,2,4]
        //[1,3,4]
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);

        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);

        l12.next = l13;
        l11.next = l12;

        l22.next = l23;
        l21.next = l22;

        System.out.println(mergeTwoLists(l11, l21));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {

        ListNode preNode = new ListNode(-1);

        ListNode head = preNode.next;
        while (l1 != null && l2 != null)
        {
            if (l1.val <= l2.val)
            {
                head.next = l1;
                l1 = l1.next;
            } else
            {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return preNode.next;
    }

    static class ListNode
    {
        int val;
        ListNode next;

        ListNode(int x)
        {
            val = x;
        }
    }
}
