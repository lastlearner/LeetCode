package com.practice.interview;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.interview
 * @ClassName: FindRepeatNumber
 * @Author: liaoyilang
 * @Description: 面试题3. 数组中重复的数字
 * @Date: 2020/2/11 下午11:06
 * @Version: 1.0
 */
public class FindRepeatNumber {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int result = findRepeatNumber(nums);
        System.out.println(result);
    }

    private static int findRepeatNumber(int[] nums) {

        int[] newNums = new int[nums.length];
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (newNums[nums[i]] > 0) {
                result = nums[i];
                return result;
            } else {
                newNums[nums[i]] += 1;
            }
        }
        return result;
    }
}
