package Unit1;

import java.util.Scanner;

/*
	编写一个静态方法histogram（），接受一个整型数组a[]和一个整数m为参数并返回一个大小
	为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0-M-
*/

public class Practice1_15 {

	private static int[] histogram(int [] a,int M) {
		
		int[] b = new int[M];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(i == a[j]) {
					b[i]++;
				}
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		in.close();
		int sum = 0;
		int[] a = new int[M];
		for(int i = 0;i<a.length;i++) {
			a[i] = 3*i;
		}
		for(int i = 0;i<histogram(a,M).length;i++) {
			System.out.println(histogram(a,M)[i]);
			sum+=histogram(a,M)[i];
		}
		System.out.println(sum);
	}

}
