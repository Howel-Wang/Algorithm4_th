package cn.howel.chapter1.section1;
/**
 *  1.1.3　编写一个程序， 从命令行得到三个整数参数。 如果它们都相等则打印equal,否则打印not equal
 *
 * 。
 */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice2
 * @Description
 * @createTime 2020年03月26日 20:42:05
 */
public class Practice3 {
    public static void main(String[] args) {
        In in = new In();
        int a = in.readInt();
        int b = in.readInt();
        int c = in.readInt();
        if (a  == b && b == c) {
            StdOut.println("equal");
        }else {
            StdOut.println("not equal");
        }
    }
}
