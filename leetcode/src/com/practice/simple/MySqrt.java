package com.practice.simple;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.simple
 * @ClassName: MySqrt
 * @Author: liaoyilang
 * @Description: NO.69 x的平方根
 * @Date: 2020/1/23 下午11:41
 * @Version: 1.0
 */
public class MySqrt {

    public static void main(String[] args) {

        int i = 0x5f3759df;
        System.out.println(i);
        int x = 4;
        int result = mySqrt(x);
        System.out.println(result);
    }

    private static int mySqrt(int x) {

//        long t = 0x5f3759df - (x >> 1);
//        while (!(t * t <= x && (t + 1) * (t + 1) > x)) {
//            t = (x / t + t) >> 1;
//        }
//        return (int) t;

        return (int)Math.sqrt(x);
    }


}
