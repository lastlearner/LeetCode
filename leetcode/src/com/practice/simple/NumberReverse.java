package com.practice.simple;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.simple
 * @ClassName: NumberReverse
 * @Author: liaoyilang
 * @Description: ${description}
 * @Date: 2019/9/30 下午5:59
 * @Version: 1.0
 */
public class NumberReverse {

    public static void main(String[] args) {

        int reverse = reverse(-123);
        System.out.println(reverse);


    }

    public static int reverse(int x) {
        long rs = 0;
        while(x !=0){
            rs = rs*10+x%10;
            x /=10;
        }

        return rs > Integer.MAX_VALUE || rs < Integer.MIN_VALUE?0:(int)rs;
    }
}
