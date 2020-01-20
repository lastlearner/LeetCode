package com.practice.simple;

import java.util.HashMap;

/**
 * @ProjectName: leetcode_practice
 * @Package: simple
 * @ClassName: NO.1 TwoSum 两数之和
 * @Author: liaoyilang
 * @Description: ${description}
 * @Date: 2019/9/29 下午4:14
 * @Version: 1.0
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{-3,4, 3, 90}, 0);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] result = new  int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        for(int k=0;k<nums.length;k++){
            if(map.keySet().contains(target-nums[k])){
                result[0]=map.get(target-nums[k]);
                result[1]=k;
                break;
            }else{
                map.put(nums[k],k);
            }
        }
        return result;
    }
}
