package Practice1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice1_1_7
 * @Description
 * @createTime 2020年03月26日 23:15:34
 */
public class Practice1_1_7 {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t);
        int sum = 0;
        for (int i = 1; i < 1000 ; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
        int sum = 0;
        for (int i = 1; i < 1000; i++) {

        }
    }
}
