package com.leetCode.java.array.easy;

/**
 * Created by mengfl on 2019/3/4.
 *
 */

public class RemoveElement {
    public static int removeElement(int array[],int val){
        int j=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]!=val){
                j++;
            }
        }
        System.out.println("j="+j);

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6,7};
        removeElement(arr,7);
    }

}
