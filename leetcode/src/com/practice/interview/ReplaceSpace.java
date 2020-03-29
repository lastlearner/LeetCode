package com.practice.interview;

/**
 * 面试题05. 替换空格
 * Created by liaoyilang on 29/03/2020.
 */
public class ReplaceSpace {

    public static void main(String[] args) {
        String s = "hello word ";

        String result = replaceSpace(s);
        System.out.println(result);

    }

    private static String replaceSpace(String s) {

        StringBuilder sb = new StringBuilder();

        if (s == null) return null;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }

}
