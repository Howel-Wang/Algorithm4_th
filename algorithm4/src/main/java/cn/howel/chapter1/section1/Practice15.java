package cn.howel.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @Description 编写一个静态方法 histogram() ，接受一个整型数组 a[] 和一个整数 M 为参数并返回一个大小 为 M 的数组， 其中第 i 个元素的值为整数 i
 * 在参数数组中出现的次数。如果 a[] 中的值均在 0 到 M-1 之间，返回数组中所有元素之和应该和 a.length 相等。
 */
public class Practice15 {

    public static int[] histogram(int[] a, int M) {
        int[] x = new int[M];
        for (int i = 0; i < x.length; i++) {
            int tmp = 0;
            for (int i1 : a) {
                if (i == i1) {
                    tmp++;
                }
            }
            x[i] = tmp;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int[] histogram = histogram(a, a.length);
        for (int i : histogram) {
            StdOut.println(i);
        }
    }

}
