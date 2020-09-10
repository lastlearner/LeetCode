package com.practice.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * NO.17 电话号码的字母组合
 * Created by liaoyilang on 30/03/2020.
 */
public class LetterCombinations {


    public static void main(String[] args) {
        List<String> strings = letterCombinations("239");
        System.out.println(strings);
    }


    static HashMap<String, String> map = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    private static List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits != null && digits.length() != 0) {
            backTrace(results, "", digits);
        }
        return results;

    }

    private static void backTrace(List<String> results, String s, String next) {
        if (next.length() == 0) {
            results.add(s);
        } else {
            String substring = next.substring(0, 1);
            String s1 = map.get(substring);

            for (int i = 0; i < s1.length(); i++) {

                String ll = s1.substring(i, i + 1);
                backTrace(results, s + ll, next.substring(1));
            }
        }

    }
}
