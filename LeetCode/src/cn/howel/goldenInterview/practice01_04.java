package cn.howel.goldenInterview;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author howel
 * @version 1.0.0
 * @Description 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。 回文串是指正反两个方向都一样的单词或短语。 排列是指字母的重新排列。 回文串不一定是字典当中的单词。
 * 示例1： 输入："tactcoa" 输出：true（排列有"tacocat"、"atcocta"，等等）
 */
public class practice01_04 {

    public static boolean canPermutePalindrome(String s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (list.contains(s.substring(i, i + 1))) {
                list.remove(s.substring(i, i + 1));
            } else {
                list.add(s.substring(i, i + 1));
            }
        }
        if (list.size() > 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "tactcoa";
        System.out.println(canPermutePalindrome(s));
    }
}
