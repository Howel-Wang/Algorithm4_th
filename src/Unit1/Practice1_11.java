package Unit1;

import java.util.Locale;

/*
 	编写一段代码，打印出一个二维布尔数组的内容。其中*表示真，空格表示假，打印出行号和列号
*/

public class Practice1_11 {

	private static void printout(boolean[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j<a[i].length; j++) {
				if (a[i][j]){
					System.out.println(String.format(Locale.CHINA,"%d  %d *",i+1,j+1));
				} else {
					System.out.println(String.format(Locale.CHINA,"%d  %d  ",i+1,j+1));
				}
			}
		}
	}
	public static void main(String[] args) {
		boolean[][] b = new boolean[][]{{true,false,false},{true,true,true}};
		printout(b);
	}
}
