package com.practice.simple;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.simple
 * @ClassName: StrStr
 * @Author: liaoyilang
 * @Description: NO.28 实现 strStr()
 * @Date: 2020/1/16 下午2:21
 * @Version: 1.0
 */
public class StrStr {
    public static void main(String[] args) {

        // 2
//        String haystack = "hello";
//        String needle = "ll";

        // -1
//        String haystack = "aaaaa";
//        String needle = "bba";

        // -1
//        String haystack = "mississippi";
//        String needle = "issipi";

        // -1
        String haystack = "mississippi";
        String needle = "sippj";

        int result = strStr(haystack, needle);
        System.out.println(result);
    }

    private static int strStr(String haystack, String needle) {

        if (needle == null || "".equals(needle)) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int count = 0;

        while (j < haystack.length() && i < needle.length()) {
            if (haystack.charAt(j) != needle.charAt(i)) {
                if (i != 0) {
                    if (j == haystack.length() - 1) {
                        return -1;
                    } else {
                        i = 0;
                        count++;
                        j = count;
                    }
                } else {
                    j++;
                }
            } else {
                i++;
                j++;
            }
        }
        if (i == needle.length()) {
            return j - needle.length();
        } else {
            return -1;
        }
    }
}
