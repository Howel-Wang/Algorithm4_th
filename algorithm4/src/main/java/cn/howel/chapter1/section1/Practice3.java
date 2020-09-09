package cn.howel.chapter1.section1;
/**
 *  1.1.3　编写一个程序， 从命令行得到三个整数参数。 如果它们都相等则打印equal,否则打印not equal
 *
 * 。
 */

import java.util.Scanner;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice2
 * @Description
 * @createTime 2020年03月26日 20:42:05
 */
public class Practice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a  == b && b == c) {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
