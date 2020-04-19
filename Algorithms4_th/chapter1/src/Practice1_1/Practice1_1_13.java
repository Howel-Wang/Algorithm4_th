package Practice1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice1_1_13
 * @Description
 * @createTime 2020年03月27日 18:26:01
 */
public class Practice1_1_13 {
    public static void main(String[] args) {

        int[][] array1 = new int[10][10];
        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array1[0].length; i1++) {
                array1[i][i1] = i;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array1[0].length; i1++) {
                System.out.printf("%d\t", array1[i][i1]);
            }
            System.out.println();
        }
        System.out.println("---------------转置后-----------------");

        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array1[0].length; i1++) {
                array1[i1][i] = i;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array1[0].length; i1++) {
                System.out.printf("%d\t", array1[i][i1]);
            }
            System.out.println();
        }

    }
}
