package com.practice.simple;

/**
 * @Description: NO.88 合并两个有序数组
 * @Auther: liaoyl
 * @Date: 2020/1/18 0018 02:01
 */
public class MergeTwoNums
{
    public static void main(String[] args)
    {
        //int[] nums1 = {1,2,3,0,0,0};
        //int[] nums2 = {2,5,6};

        //int[] nums1 = {1};
        //int[] nums2 = {};
        //int[] nums1 = {4,5,6,0,0,0};
        //int[] nums2 = {1,2,3};


        int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};

        //int[] nums1 = {0};
        //int[] nums2 = {1};

        //int[] nums1 = {2, 0};
        //int[] nums2 = {1};

        int[] result = mergeTwoNums(nums1, 1, nums2, 5);
    }

    private static int[] mergeTwoNums(int[] nums1, int m, int[] nums2, int n)
    {
        int i = m - 1, j = n - 1, p = nums1.length - 1;
        while (i >= 0 && j >= 0 && n > 0)
        {
            if (nums1[i] < nums2[j])
            {
                nums1[p] = nums2[j];
                p--;
                j--;
            } else
            {
                nums1[p] = nums1[i];
                i--;
                p--;
            }
        }
        if (m < n || j>=0)
        {
            int k =0;p=0;
            while (p <= j)
            {
                nums1[k++] = nums2[p++];
            }
        }

        return nums1;
    }

}
