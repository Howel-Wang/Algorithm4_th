package cn.howel.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @Description 习题1.1.16 -> 114224722531135710225311358311361142246810
 */
public class Practice16 {

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        StdOut.println(exR1(10));
    }
}
