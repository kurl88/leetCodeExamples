package com.leetCode.java;

import com.leetCode.java.Object.ListNode;

import java.util.LinkedList;

/**
 * Created by mengfl on 2019/3/4.
 */

public class DeleteNode{



    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5) ;
        System.out.println("listNode1="+listNode1.toString());
        ListNode listNode2 = new ListNode(6) ;
        ListNode listNode3 = new ListNode(7) ;

        ListNode listNode4 = new ListNode(8) ;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
//        System.out.println("listNode11111="+listNode4.toString());
        listNode1.deleteNode(listNode2);

        System.out.println("listNode11111="+listNode1.next.val);


        // deleteNode(listNode2);

    }
}
