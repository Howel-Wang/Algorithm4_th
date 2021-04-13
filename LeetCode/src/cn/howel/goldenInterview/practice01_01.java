package cn.howel.goldenInterview;

/**
 * @author howel
 * @version 1.0.0
 * @Description
 *      实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 *      示例 1：
 *
 *      输入: s = "leetcode"
 *      输出: false
 *      示例 2：
 *
 *      输入: s = "abc"
 *      输出: true
 *      限制：
 *
 *      0 <= len(s) <= 100
 *      如果你不使用额外的数据结构，会很加分。
 */
public class practice01_01 {

    public static boolean isUnique(String astr) {
        String s = "";
        if (astr.length() == 1) return true;
        if (astr.length() == 2) {
            if (astr.substring(0,1).equals(astr.substring(1,2))) {
                return false;
            }
        }
        for(int i = 0; i < astr.length() - 2; i++) {
            s = astr.substring(i,i+1);
            for(int j = i + 1; j < astr.length() - 1 ; j++) {
                if (s.equals(astr.substring(j, j + 1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "leetcode";
        String b = "abc";
        System.out.println(isUnique(a));
        System.out.println(isUnique(b));
    }
}
