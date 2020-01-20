package com.practice.simple;

/**
 * @Description: NO.58 最后一个单词的长度
 * @Auther: liaoyl
 * @Date: 2020/1/18 0018 01:14
 */
public class LengthOfLastWord
{
    public static void main(String[] args)
    {
        //String s = "HELLO WORLD";
        String s = "a ";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    private static int lengthOfLastWord(String s)
    {

        if (s == null || "".equals(s))
        {
            return 0;
        }
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) != ' ')
            {
                result += 1;
            } else
            {
                if (result > 0)
                {
                    break;
                }
            }
        }
        return result;
    }
}
