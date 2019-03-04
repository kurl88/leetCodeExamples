package com.leetCode.java.Object;

/**
 * Created by mengfl on 2019/2/11.
 */

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x){
        this.val=x;
    }
    public String toString(){
        return val+"";
    }

    public ListNode  deleteNode(ListNode node) {
        node =  node.next;
        node.next = node.next.next;
        return node;
    }

}
