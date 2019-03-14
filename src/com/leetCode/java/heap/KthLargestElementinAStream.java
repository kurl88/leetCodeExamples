package com.leetCode.java.heap;

import java.util.PriorityQueue;

/**
 * Created by mengfl on 2019/3/14.
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.

 Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.
 */

public class KthLargestElementinAStream {
    final PriorityQueue<Integer> q;
    final int k;

    public KthLargestElementinAStream(int k, int[] a) {
        this.k = k;
        q = new PriorityQueue<>(k);
        for (int n : a)
            add(n);
    }

    public int add(int n) {
        if (q.size() < k)
            q.offer(n);
        else if (q.peek() < n) {
            q.poll();
            q.offer(n);
        }
        return q.peek();
    }
}
