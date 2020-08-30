package cn.howel.chapter1.section1;
/**
 * 1.1.1 给出以下表达式的值：
 *
 * a. ( 0 + 15 ) / 2
 *
 * b. 2.0e-6 * 100000000.1
 *
 * c. true && false || true && true
 */

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice1
 * @Description
 * @createTime 2020年03月26日 20:42:05
 */
public class Practice1 {
    public static void main(String[] args) {
        StdOut.println(( 0 + 15 ) / 2);
        StdOut.println(2.0e-6 * 100000000.1);
        StdOut.println(true && false || true && true);
    }
}
