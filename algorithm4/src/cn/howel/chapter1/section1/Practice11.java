package cn.howel.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice11
 * @Description 打印二维布尔数组
 * @createTime 2020年03月27日 00:13:41
 */
public class Practice11 {
    public static void main(String[] args) {
        int rowLen = 6;
        int colLen = 7;
        boolean[][] array= new boolean[rowLen][colLen];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (Math.random()*10 >= 5) {
                    array[i][j] = true;
                }else {
                    array[i][j] = false;
                }
            }
        }
        StdOut.print(" ");
        for (int i = 0; i < array[0].length; i++) {
            StdOut.print(" " + (i));

        }
        StdOut.println();
        for (int i = 0; i < array.length; i++) {
            StdOut.print(i);
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]) {
                    StdOut.print(" *");
                }else {
                    StdOut.print("  ");

                }
            }
            StdOut.println();
        }

    }
}
