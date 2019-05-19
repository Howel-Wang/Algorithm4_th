package foundation;

/*
	1.1.18
	请看以下递归函数：
	public static int mystery(int a, int b){
		if(b == 0) return 0;
		if(b%2 == 0) return mystery(a+a, b/2);
		return mystery(a+a, b/2)+a;
	}
	mystery(2, 25)和mystery(3, 11)的返回值是多少？给定正整数a和b，mystery(a,b)
	计算的结果是什么？将代码中的+替换为*并将return 0改为return 1,然后回答相同的问题。
*/

public class Practice1_1_18 {

	public static int mystery(int a, int b){
		if(b == 0){
//			return 0;
			return 1;
		}
		if(b%2 == 0) {
			return mystery(a*a, b/2);
		}
		return mystery(a*a, b/2)*a;
	}
	public static void main(String[] args){
		System.out.println(mystery(2, 25));
		System.out.println(mystery(3, 11));
	}
}
