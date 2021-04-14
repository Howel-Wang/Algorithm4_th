package cn.howel.goldenInterview;

import java.util.HashMap;

/**
 * @author howel
 * @version 1.0.0
 * @Description
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * 示例 1：
 *
 *      输入: s1 = "abc", s2 = "bca" 输出: true
 * 示例 2：
 *
 *      输入: s1 = "abc", s2 = "bad" 输出: false
 * 说明：
 *      0 <= len(s1) <= 100
 *      0 <= len(s2) <=100
 */
public class practice01_02 {

    public static boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            String s = s1.substring(i, i + 1);
            if (map1.containsKey(s)) {
                map1.put(s, map1.get(s) + 1);
            } else {
                map1.put(s, 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            String s = s2.substring(i, i + 1);
            if (map2.containsKey(s)) {
                map2.put(s, map2.get(s) + 1);
            } else {
                map2.put(s, 1);
            }
        }
        if (!map1.equals(map2)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abcdabcd";
        String s2 = "abcdabcd";
        System.out.println(CheckPermutation(s1, s2));
    }
}
