package com.leetCode.java;

/**
 * Created by mengfl on 2019/2/11.
 * 整数反转
 */

public class ReverseInteger {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        int value = reverse(2147483647);//-2147483648~2147483647
        System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE="+Integer.MIN_VALUE);
        System.out.println("value="+value);
    }
}
