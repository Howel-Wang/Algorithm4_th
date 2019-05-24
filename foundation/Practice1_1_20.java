
/*
	编写一个递归的静态方法计算ln(N!)的值。
*/

import java.util.Scanner;

public class Practice1_1_20 {
	private static double logarithmic(int N){
		if(N == 0){
			return 0;
		}
		if(N == 1){
			return 0;
		}
		return (logarithmic(N-1)+Math.log(N));
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		System.out.println(logarithmic(N));
	}
}
