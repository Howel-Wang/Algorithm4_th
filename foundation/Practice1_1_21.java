
/*
	1.1.21

	编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。然后用printf()打印一张表格，每行的若干
	列数数据包括名字，两个整数和第一个整数除以第二个整数的结果，精确到小数点后三位。可以用这种程序将棒球球手的击球命中
	率或者学生的考试分数制成表格。
*/

import java.util.Scanner;

public class Practice1_1_21 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int M = 3;
		int i = 0;
		String[] list = new String[M];
		while (i < M) {
			list[i++] = in.nextLine();
		}
		for(int j = 0; j < list.length; j++){
			String[] a = list[j].split(" ");
			int s1 = Integer.parseInt(a[1]);
			int s2 = Integer.parseInt(a[2]);
			System.out.printf("%s\t%d\t%d\t%.3f\n",a[0],s1,s2,(double)s1/s2);
		}

	}
}
