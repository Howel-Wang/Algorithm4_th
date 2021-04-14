package cn.howel.goldenInterview;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author howel
 * @version 1.0.0
 * @Description 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。 示例 1：
 * <p>
 * 输入: s1 = "abc", s2 = "bca" 输出: true 示例 2：
 * <p>
 * 输入: s1 = "abc", s2 = "bad" 输出: false 说明： 0 <= len(s1) <= 100 0 <= len(s2) <=100
 */
public class practice01_02 {

    public static boolean CheckPermutation(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        String s1 = "abcdabcd";
        String s2 = "abcdabcd";
        System.out.println(CheckPermutation(s1, s2));
    }
}
