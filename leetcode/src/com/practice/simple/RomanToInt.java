package com.practice.simple;

import java.util.HashMap;

/**
 * @Description: NO.13 罗马数字转整数
 * @Auther: liaoyl
 * @Date: 2019/11/26 0026 23:43
 */
public class RomanToInt
{
    public static void main(String[] args)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(8);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //String s = "MCMXCIV";
        String s = "IV";
        int sum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (i + 1 < s.length())
            {
                char temp = s.charAt(i + 1);
                if (map.get(c) >= map.get(temp))
                {
                    sum += map.get(c);
                } else
                {
                    sum += (map.get(temp) - map.get(c));
                    i++;
                }
            } else
            {
                sum += map.get(c);
            }
        }
        System.out.println(sum);
    }
}
