package com.practice.interview;


import java.util.Stack;

/**
 * Created by liaoyilang on 11/03/2020.
 */
public class StringInAndOut {


//    // 输入：一个字符串
//
//// 输出：是一个字符数组，不包含b和连续的ac子串
//
//// 输入：bac，输出：空串
//
//// 输入：abc，输出：空串
//
//// 输入：aaabccc，输出：空串（美团）


    public static void main(String[] args) {


        String s = "abcdef";

        String result = filterString(s);

        System.out.println(result);

    }

    private static String filterString(String s) {
        if (s == null || s.trim().equalsIgnoreCase("")) {
            return "空串";
        } else {
            Stack<Character> characters = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'b') {
                    continue;
                } else if (s.charAt(i) == 'c') {
                    if (!characters.isEmpty()) {
                        characters.pop();
                    } else {
                        characters.push(s.charAt(i));
                    }
                } else {
                    characters.push(s.charAt(i));
                }
            }
            if (characters.isEmpty()) {
                return "空串";
            } else {
                StringBuilder sb = new StringBuilder();
                Stack<Character> c2 = new Stack<>();
                while (!characters.isEmpty()) {
                    c2.push(characters.pop());
                }
                while (!c2.isEmpty()) {
                    sb.append(c2.pop());
                }
                return sb.toString();
            }
        }
    }

}
