package Practice1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Q: 编写一个静态方法 lg() ，接受一个整型参数 N ，返回不大于 log 2N 的最大整数。不要使用 Math 库。
 *
 * @author howel
 */
public class Practice1_1_14 {
    public static int lg(int N) {
        int x = 0;
        int sum = 1;
        do {
            sum = sum * 10;
            x++;
        } while (sum < 2 * N);
        return x;
    }

    public static void main(String[] args) {
        int N = 400;
        int result = lg(N);
        StdOut.println(result);
    }

}
