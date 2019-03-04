package com.leetCode.java;

import com.leetCode.java.Object.ListNode;

/**
 * Created by mengfl on 2019/3/4.
 */

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5) ;
        ListNode listNode2 = new ListNode(6) ;
        ListNode listNode3 = new ListNode(7) ;

        ListNode listNode4 = new ListNode(8) ;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;

        System.out.println("node1.toString()="+listNode1.toString());

        ListNode node = reverseList(listNode1);
        System.out.println("node.toString()="+node.toString());
        ;
    }
}
