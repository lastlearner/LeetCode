package com.practice.simple;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.simple
 * @ClassName: SearchInsert
 * @Author: liaoyilang
 * @Description: NO.35 搜索插入位置
 * @Date: 2020/1/16 下午3:03
 * @Version: 1.0
 */
public class SearchInsert {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = searchInsert(nums, target, 0);
        System.out.println(result);
    }

    private static int searchInsert(int[] nums, int target, int i) {

        if (i == nums.length || target <= nums[i]) {
            return i;
        } else {

            return searchInsert(nums, target, ++i);
        }

    }
}
