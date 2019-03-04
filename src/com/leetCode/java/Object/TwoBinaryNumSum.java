package com.leetCode.java.Object;

/**
 * Created by mengfl on 2019/2/25.
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。

 输入为非空字符串且只包含数字 1 和 0。




 示例 1:

 输入：a = "11" b="1"

 输出："100"

 示例 2:

 输入：a = "1010" b="1011"

 输出："10101"






 思路：

 根据二进制的相加规则，当前位相加再%2则为结果，进位则/2。

 可以先建立一个StringBuilder类型的result，从后往前，将每一位相加，结果加入result，最后反转输出。
 ---------------------
 作者：燎原_
 来源：CSDN
 原文：https://blog.csdn.net/qq_37429553/article/details/80726246
 版权声明：本文为博主原创文章，转载请附上博文链接！
 */

public class TwoBinaryNumSum {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int al = a.length() - 1;
        int bl = b.length() - 1;
        int carry = 0;

        while (al >= 0 || bl >= 0) {
            int sum = carry;
            if (al >= 0) {
                System.out.println("a.charAt(al)="+a.charAt(al));
                System.out.println("a.charAt(al)2="+(a.charAt(al) - '0'));

                sum += (a.charAt(al) );
                al--;
            }
            if (bl >= 0) {
                sum += (b.charAt(bl) );
                bl--;
            }
            result.append(sum % 2);   //相加结果 %取余数
            carry = sum / 2;         //进位，如果是1那么carry=0，如果是2则要进位给下面一位+1 /取整数
        }

        if (carry != 0)              //都相加完了，还要进位的情况
            result.append(1);

        return result.reverse().toString();  //先反转，再输出

    }

    public static void main(String[] args) {
        String result = addBinary(10000+"",111+"");
        System.out.println("result="+result);
        System.out.println("3/2=="+3/2);
        System.out.println("3%2="+3%2);
    }
}
