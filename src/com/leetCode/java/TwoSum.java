package com.leetCode.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mengfl on 2019/2/2.
 */

public class TwoSum {
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.println("i=" + i + ",j=" + j);
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target-nums[i];
            if (map.containsKey(value)){
                System.out.println("i=" + i + ",j=" + (Integer) map.get(value));

                return new int[]{i, (Integer) map.get(value)};
            }
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }



    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 5};
        int target = 9;
        twoSum2(nums, target);
    }
}
