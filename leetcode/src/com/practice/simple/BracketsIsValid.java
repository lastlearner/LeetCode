package com.practice.simple;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

/**
 * @Description: NO.20 有效的括号
 * @Auther: liaoyl
 * @Date: 2020/1/15 0015 00:38
 */
public class BracketsIsValid
{
    public static void main(String[] args)
    {
        String str = "()[]{}";
        String str2 = "([)]";
        boolean b = bracketsIsValid(str2);
        System.out.println(b);
    }

    private static boolean bracketsIsValid(String str)
    {

        if(str == null || str.length()==0) return false;
        Stack<Character> chars = new Stack<>();
        HashMap<Character, Character> maps = new HashMap<>();
        maps.put(')','(');
        maps.put('}','{');
        maps.put(']','[');

        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(!maps.keySet().contains(c)){
                chars.add(c);
            }else{
                if(chars.size()==0){
                    return false;
                }
                Character pop = chars.pop();
               if(!Objects.equals(maps.get(c),pop)){
                   return false;
               }
            }
        }
        return chars.size() == 0;
    }
}
