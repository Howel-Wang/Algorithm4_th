

/*		
	1.1.3
	编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal，否则打印 not equal。

 
*/

import java.util.Scanner;

public class Practice1_1_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String i = in.next();
		String j = in.next();
		String k = in.next();
		in.close();
		Integer num1 = Integer.valueOf(i);
		Integer num2 = Integer.valueOf(j);
		Integer num3 = Integer.valueOf(k);
		// if(num1==num3&&num1==num2&&num2==num3)   这样的num1，num2，num3比较的对象是否相等而不是值是否相等 
		if(num1.intValue()==num3.intValue()&&num1.intValue()==num2.intValue()&&num2.intValue()==num3.intValue()) {
			System.out.println("equal");
		}else {
			System.out.println("no equal");
		}
	}

}
