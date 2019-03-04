package com.leetCode.java.string.easy;

/**
 * Created by mengfl on 2019/3/4.
 */

public class WordsReverse {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            res.append(new StringBuilder(words[i]).reverse().toString() +" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
         String result = reverseWords("Hello World , I am Coming !");
        System.out.println("result="+result);
    }
}
