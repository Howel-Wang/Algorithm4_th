package Unit1;
/*
	1.1.17
	找出一下递归函数的问题：
	public static String exR2(int n){
		String s = exR2(n-3) + n + exR2(n-2) + n;
		if (n <= 0) return "";
		return s;
	}

	答：这段代码中的基础情况永远不会被访问。调用exR2(3)会产生调用exR2(0),exR2(-3)和exR(-6),循环往复知道发生StackOverflowError。
*/
public class Practice1_1_17 {

	public static String exR2(int n){
		String s = exR2(n-3) + n + exR2(n-2) + n;
		if (n <= 0) return "";
		return s;
	}
	public static void main(String[] args){
		exR2(3);
	}
}
