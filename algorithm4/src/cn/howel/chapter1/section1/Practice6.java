package cn.howel.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;
/**
 * 1.1.6 下面这段程序会打印出什么?
 *  int f = 0;
 *  int g = 1;
 *  for (int i = 0; i <= 15 ; i++) {
 *      StdOut.println(f);
 *     f = f + g;
 *     g = f - g;
 *  }
 */

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice6
 * @Description
 * @createTime 2020年03月26日 22:51:21
 */
public class Practice6 {
    public static void main(String[] args) {
        int g = 1;
        int f = 0;
        for (int i = 0; i <= 15 ; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

}
