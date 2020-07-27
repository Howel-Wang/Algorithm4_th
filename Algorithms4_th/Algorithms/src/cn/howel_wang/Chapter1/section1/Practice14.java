package cn.howel_wang.Chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * Q: 编写一个静态方法 lg() ，接受一个整型参数 N ，返回不大于 log 2N 的最大整数。不要使用 Math 库。
 *
 * @author howel
 */
public class Practice14 {
    public static int lg(int N) {
        int x = 0;
        int sum = 1;
        while (sum <= 2 * N) {
            sum = sum * 10;
            x++;
        }
        x--;
        return x;
    }

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int result = lg(N);
        StdOut.println(result);
    }

}
