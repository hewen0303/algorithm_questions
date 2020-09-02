package com.hetangyuese.simple;

/**
 * @program: algorithm_questions
 * @description:
 * @author: hewen
 * @create: 2020-09-02 10:21
 **/
public class Test0902 {

    /**
     *  数组翻转
     * 反转一个只有3位数的整数。
     * 你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。
     * 样例 1:
     * 输入: number = 123
     * 输出: 321
     * 样例 2:
     * 输入: number = 900
     * 输出: 9
     */


    /**
     *  自己的思路
     *  1. 题目规定了数字必须是三位，所以排除不符合的数字
     *  2. 转换成字符串，按字符切割在倒序排列
     * @param number
     * @return
     */
    public static int changeNumber(int number) {
        if (validateNumber(number)) {
            return 0;
        }
        String numberStr = String.valueOf(number);
        char[] arr = numberStr.toCharArray();
        StringBuffer sb = new StringBuffer();
        sb.append(arr[2]).append(arr[1]).append(arr[0]);
        return Integer.valueOf(sb.toString());
    }

    private static boolean validateNumber(int number) {
        if ((number < 100 || number > 1000)) {
            return true;
        }
        return false;
    }

    /**
     *  toCharArray返回字符码数组
     * @param number
     * @return
     */
    public static int changeNumber1(int number) {
        if (validateNumber(number)) {
            return 0;
        }
        String numberStr = String.valueOf(number);
        StringBuffer sb = new StringBuffer();
        char[] arr = numberStr.toCharArray();
        for (int i = arr.length - 1; i>=0; i--) {
            sb.append(arr[i]);
        }
        return Integer.valueOf(sb.toString());
    }

    /**
     *  倒序循环 charAt
     * @param number
     * @return
     */
    public static int changeNumber2(int number) {
        if (validateNumber(number)) {
            return 0;
        }
        String numberStr = String.valueOf(number);
        int length = numberStr.length();
        StringBuffer sb = new StringBuffer();
        for (int i = length-1; i >= 0; i--) {
            sb.append(numberStr.charAt(i));
        }
        return Integer.valueOf(sb.toString());
    }

    /**
     *  stringbuffer reverse()倒序方法
     * @param number
     * @return
     */
    public static int changeNumber3(int number) {
        if (validateNumber(number)) {
            return 0;
        }
        String numberStr = String.valueOf(number);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numberStr.length(); i++) {
            sb.append(numberStr.charAt(i));
        }
        return Integer.valueOf(sb.reverse().toString());
    }


    /**
     *  test02 输入字符大小写替换
     *  如 a - > A
     *  aR -> Ar
     * @param str
     */
    /**
     *  思路：
     *  1. 判断字符是否为空
     *  2. 字符转换成数组
     *  3. 循环判断字符大小写，在对应进行转换
     * @param str
     * @return
     */
    public static String changeStr(String str) {
        if (null == str || str.length() == 0) {
            return null;
        }
        StringBuilder  sb = new StringBuilder ();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // 如果是大写
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    /**
     *  根据ASII码值来
     * @param str
     * @return
     */
    public static String changeStr1(String str) {
        if (null == str || str.length() == 0) {
            return null;
        }
        StringBuilder  sb = new StringBuilder ();
        for (int i=0; i<str.length(); i++) {
            int c = str.charAt(i);
            char c1 = 0;
            if (65 <= c && c <= 90) {
                c1 = (char)(c+32);
            } else if (97 <= c && c <= 122) {
                c1 = (char)(c-32);
            } else {
                c1 = str.charAt(i);
            }
            sb.append(c1);
        }
        return sb.toString();
    }

    public static char lowercaseToUppercase(char character) {
        // write your code here
        if (character == 0) {
            return 0;
        }
        if (Character.isUpperCase(character)) {
            // 如果是大写
            return Character.toLowerCase(character);
        }
        return Character.toUpperCase(character);
    }


    public static void main(String[] args) {
        System.out.println(lowercaseToUppercase('Z'));
    }


}
