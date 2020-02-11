package com.practice.simple;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.simple
 * @ClassName: IsPalindrome
 * @Author: liaoyilang
 * @Description: NO.125 验证回文串
 * @Date: 2020/2/11 下午10:17
 * @Version: 1.0
 */
public class IsPalindrome {

    public static void main(String[] args) {
        String src = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(src);

        System.out.println(result);
    }

    private static boolean isPalindrome(String src) {

        int i = 0;
        int j = src.length() - 1;
        String s = src.toLowerCase();

        while (i <= j) {
            char c = s.charAt(i);
            char c2 = s.charAt(j);
            if (!isaBoolean(c)) {
                ++i;
                continue;
            }
            if (!isaBoolean(c2)) {
                --j;
                continue;
            }
            c = s.charAt(i++);
            c2 = s.charAt(j--);
            if (isaBoolean(c) && isaBoolean(c2)) {
                if (c != c2) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isaBoolean(char c) {
        return (c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
