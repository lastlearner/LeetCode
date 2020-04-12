package com.practice.lanqiao;

/**
 * 煤球数目
 * 第一层放一个
 * 第二层放三个
 * 第三层放6个
 * 。。。。。。
 * 如果共有一百层，共有多少个煤球
 *
 * @author liaoyilang
 * @date 2020/04/12
 */
public class BriquettesCount {
    public static void main(String[] args) {
        int result = test(100);
        System.out.println(result);
    }

    private static int test(int n) {
        int sum = 0;
        int nr = 0;

        for (int i = 1; i <= n; i++) {
            nr = nr + i;
            sum += nr;
        }
        return sum;
    }
}
