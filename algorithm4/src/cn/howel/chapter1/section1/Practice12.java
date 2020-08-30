package cn.howel.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice12
 * @Description
 * @createTime 2020年03月27日 18:26:01
 */
public class Practice12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
            StdOut.println(i);
        }
    }
}
