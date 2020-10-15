package cn.howel.chapter1.section1;
/**
 *
 *1.1.5  编写一段程序,如果double类型的变量 x和 y都严格位于 0 和 1 之间则打印true,否则打印false。
 */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice2
 * @Description
 * @createTime 2020年03月26日 20:42:05
 */
public class Practice5 {
    public static void main(String[] args) {
        In in = new In();
        double x = in.readDouble();
        double y = in.readDouble();
        if (Compare(x) && Compare(y)) {
            StdOut.println("true");
        }else {
            StdOut.println("false");
        }
    }
    public static boolean Compare(double a) {
        if (a > 0 && a < 1){
            return true;
        }else {
            return false;
        }
    }

}
