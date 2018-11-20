package Unit1;
/*
	1.1.9
	编写一段代码，将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s。
*/
public class Practice1_9 {

	public static void main(String[] args) {
		int N = 19;
		String s = "";
		for (int n = N; n > 0; n /= 2) {
			s = (n % 2) + s;
		}
		System.out.println(s);

	}

}
