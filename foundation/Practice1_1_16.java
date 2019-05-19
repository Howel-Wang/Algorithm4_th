package foundation;

import java.util.Scanner;

/*
 	1.1.16给出exR1(6)的返回值：
 	public static String exR1(int n){
 		if(n <= 0) return "";
 		return exR1(n-3) + n + exR1(n-2) + n;
 		
 	}
*/

public class Practice1_1_16 {

	public static String exR1(int n){
 		if(n <= 0) return "";
 		return exR1(n-3) + n + exR1(n-2) + n;
 		
 	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(exR1(n));

	}

}
