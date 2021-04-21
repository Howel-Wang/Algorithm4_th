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
        if (first == null) return false;
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        int l1 = first.length();
        int l2 = second.length();
        int diff = l1 - l2 > 0 ? l1 - l2 : l2 - l1;
        if (diff > 1) {
            return false;
        } else {
            if (l1 >= l2) {
                for (int i = 0; i < l1; i++) {
                    list1.add(first.substring(i, i + 1));
                }
                for (int i = 0; i < l2; i++) {
                    list2.add(second.substring(i, i + 1));
                }
                for (int i = 0; i < l2; i++) {
                    if (list1.get(i) == list2.get(i)) {

                    } else {
                        list1.remove(list1.get(i));
                        return list1.equals(list2);
                    }
                }
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
