package cn.howel.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice7
 * @Description
 * @createTime 2020年03月26日 23:15:34
 */
public class Practice7 {
    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }


    private static void f1() {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
    }
    private static void f2() {
       int sum = 0;
        for (int i = 1; i < 1000 ; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }
    private static void f3() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }
}
