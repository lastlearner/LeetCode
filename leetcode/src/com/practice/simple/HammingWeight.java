package com.practice.simple;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.simple
 * @ClassName: HammingWeight
 * @Author: liaoyilang
 * @Description: NO.191 位1的个数
 * @Date: 2020/2/11 下午10:47
 * @Version: 1.0
 */
public class HammingWeight {

    public static void main(String[] args) {
        int n = 12;
        int result = hammingWeight(n);
        System.out.println(result);
    }

    private static int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n & (n - 1);
        }
        return sum;


//        int sum = 0;
//        int mask = 1;
//
//        for (int i = 0; i < 32; i++) {
//            if((n & mask) != 0){
//                sum ++;
//            }
//            mask <<= 1;
//        }
//        return sum;
    }
}
