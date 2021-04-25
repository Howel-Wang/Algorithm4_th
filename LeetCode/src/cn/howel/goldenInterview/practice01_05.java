package cn.howel.goldenInterview;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 * <p>
 * 示例1:
 * <p>
 * 输入:
 * first = "pale"
 * second = "ple"
 * 输出: True
 * 示例2:
 * <p>
 * 输入:
 * first = "pales"
 * second = "pal"
 * 输出: False
 */
public class practice01_05 {

    public static boolean oneEditAway(String first, String second) {
        if (first == null || second == null) return false;
        int len1 = first.length();
        int len2 = second.length();
        if (Math.abs(len1 - len2) > 1) return false;
        // 保证每次较长的字符串在前面
        if (len2 > len1) return oneEditAway(second, first);
        for (int i = 0; i < len2; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                // 长度相同的话，就从下一个字符开始比较，不同的话，就从当前字符开始比较。（以短字符为主）
                return first.substring(i + 1).equals(second.substring(len1 == len2 ? i + 1 : i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String first = "pale";
        String second = "ple";
        System.out.println(oneEditAway(first, second));
    }
}
