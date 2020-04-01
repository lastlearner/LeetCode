package com.practice.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * NO.22 括号生成
 * Created by liaoyilang on 01/04/2020.
 */
public class GenerateParenthesis {

    public static void main(String[] args) {
        int n = 3;

        // Method 1  回溯法，深度优先，第一个结果，会是 ((())) ,最后一个结果是 ()()()
        ArrayList<String> result = new ArrayList<>();
        backTrace(result, "", 0, 0, n);
        System.out.println(result);

        // Method 2 回溯法, 广度优先，第一个结果是()()(), 最后一个结果是((()))
        List<String> result2 = generateParenthesis( n);
        System.out.println(result2);
    }

    private static List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        if(n == 0 ){
            result.add("");
        }else{
            for (int i = 0; i < n; i++) {
                for (String left : generateParenthesis(i)) {
                    for (String right : generateParenthesis(n - i - 1)) {
                        result.add("("+left +")"+right);
                    }
                }
            }
        }
        return result;
    }

    private static void backTrace(ArrayList<String> result, String s, int left, int right, int n) {

        if (s.length() == n << 1) {
            result.add(s);
            return;

        }
        if (left < n) {
            backTrace(result, s + "(", left + 1, right, n);
        }
        if (right < left) {
            backTrace(result, s + ")", left, right + 1, n);
        }
    }
}
