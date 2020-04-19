package Practice1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author howel
 * @version 1.0.0
 * @ClassName Practice1_1_8
 * @Description
 * @createTime 2020年03月26日 23:55:19
 */
public class Practice1_1_8 {
    public static void main(String[] args) {
        StdOut.println('b'); // 打印出字符b
        StdOut.println('b' + 'c'); // 两个字符相加-> 转换成两个字符所对应的ascll码值相加
        StdOut.println((char) ('a' + 4)); // 'a'的ascll码+4 得到 'e'的ascll码 再转换为char类型
    }
}
