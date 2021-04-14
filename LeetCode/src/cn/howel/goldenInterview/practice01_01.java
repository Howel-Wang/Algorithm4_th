/**
    实现一个算法，确定一个字符串 s 的所有字符是否全都不同。

    示例 1：

    输入: s = "leetcode"
    输出: false
    示例 2：

    输入: s = "abc"
    输出: true
    限制：

    0 <= len(s) <= 100
    如果你不使用额外的数据结构，会很加分。
*/
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
        /*String s = "";
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
        return true;*/
        long low64 = 0;
        long high64 = 0;

        for (char c : astr.toCharArray()) {
            if (c >= 64) {
                long bitIndex = 1L << (c - 64);
                if ((high64 & bitIndex) != 0) {
                    return false;
                }
                high64 |= bitIndex;
            } else {
                long bitIndex = 1L << c;
                if ((low64 & bitIndex) != 0) {
                    return false;
                }
                low64 |= bitIndex;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyzz";
        boolean result = false;
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            result = isUnique(a);
        }
        long l2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(l2-l1);
    }
}
