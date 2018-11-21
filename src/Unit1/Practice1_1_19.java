package Unit1;
/*
	1.1.19
	在计算机上运行一下程序
	public class Fibonacci{
		public static long F(int N){
			if(N == 0) return 0;
			if(N == 1) return 1;
			return F(N-1) + F(N-2);
		}
		public static void main(String[] args){
			for(int N = 0; N < 100; N++){
				StdOut.println(N + "" +F(N));
			}
		}
	}
*/
public class Practice1_1_19 {
	public static long F(int N){
		if(N == 0) return 0;
		if(N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	public static void main(String[] args){
		for(int N = 0; N < 100; N++){
			System.out.println(N + "\t" +F(N));
		}
	}
}
/*
	改进的Fibonacci

public class Practice1_19 {
	public static long F(int N){
		if(N == 0) {
			return 0;
		}
		if(N == 1) {
			return 1;
		}
		long a = 0;
		long b = 1;
		for(int i = 0; i < N; i++){
			a = a + b;
			b = a - b;
		}
		return a;

	}
	public static void main(String[] args){
		for(int N = 0; N < 100; N++){
			System.out.println(N + "\t" +F(N));
		}
	}
}
*/
