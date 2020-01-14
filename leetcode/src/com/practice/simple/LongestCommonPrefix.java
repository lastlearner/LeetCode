package com.practice.simple;

/**
 * @Description: NO.14 查找字符串数组中的最长公共前缀
 * @Auther: liaoyl
 * @Date: 2020/1/15 0015 00:23
 */
public class LongestCommonPrefix
{

    public static void main(String[] args)
    {
        String[] strs = {"klowers","flow","fligh"};
        System.out.println(getLongestCommonPrefix(strs));
    }

    private static String getLongestCommonPrefix(String[] strs)
    {
        if(strs == null || strs.length==0) return "";

        String preStr = strs[0];
        for (int i = 1 ;i<strs.length;i++)
        {
            while(strs[i].indexOf(preStr) != 0 ){
                preStr = preStr.substring(0,preStr.length()-1);
                if(preStr.length()==0)return "";
            }
        }
        return preStr;
    }
}
