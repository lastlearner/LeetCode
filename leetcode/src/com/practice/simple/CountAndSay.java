package com.practice.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 38. 外观数列
 * @Auther: liaoyl
 * @Date: 2020/1/19 0019 22:43
 */
public class CountAndSay
{

    public static void main(String[] args)
    {
        int n = 9;
        String result = countAndSay(5);
        System.out.println(result);
    }

    private static String countAndSay(int n)
    {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "11");
        for (int i = 3; i <= n; i++)
        {
            int count = 1;
            String s = map.get(i - 1);
            int p = 0;
            StringBuilder sb = new StringBuilder();
            for (int i1 = 1; i1 < s.length(); i1++)
            {
                Character c = s.charAt(p);
                if (c == s.charAt(i1))
                {
                    count += 1;
                } else
                {
                    sb.append(count).append(c);
                    map.put(i, sb.toString());
                    c = s.charAt(i1);
                    count = 1;
                }
                if (i1 == s.length() - 1)
                {
                    sb.append(count).append(c);
                    map.put(i, sb.toString());
                }
                p++;
            }
        }
        return map.get(n);
    }
}
