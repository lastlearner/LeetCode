package com.practice.simple;

/**
 * @Description: NO.26 原地删除排序数组中的重复元素
 * @Auther: liaoyl
 * @Date: 2020/1/16 0016 01:48
 */
public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    private static int removeDuplicates(int[] nums)
    {
        if (nums.length == 0)
        {
            return 0;
        }
        int pre = nums[0];
        int result = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] != pre)
            {
                pre = nums[i];
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
