package com.leetCode.java.binaryIndexedTree;

/**
 * Created by mengfl on 2019/3/14.
 * 21. Merge Two Sorted Lists

 */

public class NumArray {
    private static int[] nums;


    public void update(int i, int val) {
        nums[i]=val;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = 0; k < nums.length; k++) {
            sum += nums[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray();
        nums= new int[]{1, 2, 3};
        System.out.println("before="+numArray.sumRange(0,2));
        numArray.update(1,0);
        System.out.println("after="+numArray.sumRange(0,2));


    }
}
