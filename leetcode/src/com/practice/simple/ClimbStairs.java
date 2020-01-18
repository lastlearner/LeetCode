package com.practice.simple;

/**
 * @Description: NO.70 爬楼梯
 * @Auther: liaoyl
 * @Date: 2020/1/19 0019 00:34
 */
public class ClimbStairs
{
    public static void main(String[] args)
    {
        int n = 7;
        int result = climbStairs(n);
        System.out.println(result);
    }

    private static int climbStairs(int n)
    {
        int[] ints = new int[n + 1];
        if (n == 1)
        {
            return 1;
        }
        ints[1] = 1;
        ints[2] = 2;
        for (int i = 3; i <= n; i++)
        {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n];
    }
}
