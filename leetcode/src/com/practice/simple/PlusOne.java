package com.practice.simple;

/**
 * @Description: NO.66 加1
 * @Auther: liaoyl
 * @Date: 2020/1/18 0018 01:37
 */
public class PlusOne
{
    public static void main(String[] args)
    {
        int[] nums = {9, 9, 9};
        int[] result = plusOne(nums);
        System.out.println(result);
    }

    private static int[] plusOne(int[] nums)
    {
        int i = nums.length - 1;
        nums[i] += 1;
        while (i > 0)
        {
            if (nums[i] < 10)
            {
                return nums;
            } else
            {
                nums[i] = (nums[i]) - 10;
                nums[i - 1] += 1;
            }
            i--;
        }
        if (nums[0] < 10)
        {
            return nums;
        } else
        {
            int[] nums2 = new int[nums.length + 1];
            nums2[0] = 1;
            nums2[1] = nums[0] - 10;
            for (int i1 = 1; i1 < nums.length; i1++)
            {
                nums2[i1 + 1] = nums[i1];
            }
            return nums2;
        }
        //int i = nums.length-1;
        //if(nums[i]+1 <10){
        //    nums[i]=nums[i]+1;
        //    return nums;
        //}else{
        //    nums[i]=(nums[i]+1)%10;
        //    nums[i-1]+=(nums[i]+1)/10;
        //    --i;
        //}
        //while(i>=0){
        //    if(i==0){
        //        if(nums[i]<10){
        //            return nums;
        //        }else{
        //            nums[i]=nums[i]%10;
        //        }
        //    }
        //    if( nums[i] >10){
        //        nums[i]=(nums[i])%10;
        //        nums[i-1]+=(nums[i]+1)/10;
        //    }
        //}
        //return nums;
    }
}
