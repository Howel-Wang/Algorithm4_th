package Unit1;

/*
	1.1.5
	编写一段程序，如果 double 类型的变量 x 和 y 都严格位于 0 和 1 之间则打印 true，否则打印 false

*/

import java.util.Scanner;


public class Practice1_1_5 {

	private boolean between0And1(double x, double y) {
		if((x<1&&x>0)&&(y<1&&y>0)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double i = in.nextDouble();
		double j = in.nextDouble();
		in.close();
		Practice1_1_5 a = new Practice1_1_5();
		System.out.println(a.between0And1(i, j));
		
		
	}

}
