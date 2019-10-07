package com.practice.simple;

/**
 * @Description: 判断是否为回文数
 * @Auther: liaoyl
 * @Date: 2019/10/7 0007 21:37
 */
public class Palindrome
{

    public static void main(String[] args)
    {

        int x = 123;
        // 字符串法
        //String s =x + "";
        //StringBuilder sb = new StringBuilder(s);
        //StringBuilder reverse = sb.reverse();
        //return s.equals(reverse.toString());


        // 整数反转法
        int temp =x;
        if(temp < 0){
            //return false;
        }
        int ret = 0;
        while(temp>0){
            ret = ret * 10 + temp %10;
            temp = temp / 10;
        }
        //return x==ret;
    }
}
