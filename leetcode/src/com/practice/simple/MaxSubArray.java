package com.practice.simple;

/**
 * @Description: NO.53 最大子序列和
 * @Auther: liaoyl
 * @Date: 2020/1/19 0019 23:43
 */
public class MaxSubArray
{
    public static void main(String[] args)
    {
        int[] nums = {-2, 1, 3, -4, 2, -1, 4, 1, -2};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    private static int maxSubArray(int[] nums)
    {
        int ret = nums[0];
        int sum = 0;
        for (int num : nums)
        {
            if (sum > 0)
            {
                sum += num;
            } else
            {
                sum = num;
            }
            ret = sum > ret ? sum : ret;
        }
        return ret;
    }
}
