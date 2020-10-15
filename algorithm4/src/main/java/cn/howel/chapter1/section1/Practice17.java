package cn.howel.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @Description 习题1.1.17 -> 这段代码中的基础情况永远不会被访问。 调用 exR2(3)会产生调用 exR2(0)、exR2(-3)和exR2(-6),
 *                            循环往复直到发生 StackOverflowError
 */
public class Practice17 {

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) {
            return "";
        }
        return s;
    }

    public static void main(String[] args) {
        StdOut.println(exR2(10));
    }
}
