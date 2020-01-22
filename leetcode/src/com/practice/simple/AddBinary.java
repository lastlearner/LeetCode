package com.practice.simple;

/**
 * @ProjectName: LeetCode
 * @Package: com.practice.simple
 * @ClassName: AddBinary
 * @Author: liaoyilang
 * @Description: NO.67 二进制求和
 * @Date: 2020/1/23 上午12:12
 * @Version: 1.0
 */
public class AddBinary {

    public static void main(String[] args) {

        String bin1 = "1010";
        String bin2 = "1011";

        String result = addBinary(bin1, bin2);


        System.out.println(result);
    }

    private static String addBinary(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder();
        int ca = 0;
        for (int i = bin1.length() - 1, j = bin2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? bin1.charAt(i) - '0' : 0;
            sum += j >= 0 ? bin2.charAt(j) - '0' : 0;
            sb.append(sum % 2);
            ca = sum / 2;
        }
        sb.append(ca == 1 ? 1 : "");
        return sb.reverse().toString();
    }
}
