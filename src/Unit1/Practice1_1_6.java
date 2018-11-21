package Unit1;
/*		
	1.1.6
	下面这段程序会打印出什么?
		
	int f = 0;
	int g = 1;
	for (int i = 0; i <= 15; i++)
	{
	  StdOut.println(f);
	  f = f + g;
	  g = f - g;
	}
*/
// 用来展示斐波拉契数列
public class Practice1_1_6 {

	public static void main(String[] args) {
		int f = 0;
		int g = 1;
		for (int i = 0; i<= 15; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
	}

}
