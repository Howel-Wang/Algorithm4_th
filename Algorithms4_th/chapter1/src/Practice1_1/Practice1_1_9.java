package Practice1_1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice1_1_9
 * @Description
 * @createTime 2020年03月27日 00:02:03
 */
public class Practice1_1_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        StdOut.println(Integer.toBinaryString(N));
        StdOut.println(s);
    }
}
