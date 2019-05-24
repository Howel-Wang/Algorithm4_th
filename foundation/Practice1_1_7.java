
/*		
	1.1.7
	分别给出以下代码段打印出的值:
		
	//a.
	double t = 9.0;
	while (Math.abs(t - 9.0/t) > .001)
		t = (9.0/t + t) / 2.0;
	StdOut.printf("%.5f\n", t);
	//b.
	int sum = 0;
	for (int i = 1; i < 1000; i++)
		for (int j = 0; j < i; j++)
			sum++;
	StdOut.println(sum);
	//c.
	int sum = 0;
	for (int i = 1; i < 1000; i *= 2)
		for (int j = 0; j < 1000; j++)
			sum++;
	StdOut.println(sum);
*/
public class Practice1_1_7 {

	public static void main(String[] args) {
		double t = 9.0;
		int sum = 0;
		while(Math.abs(t - 9.0/t) > .001) {
			t = (9.0/t + t) / 2.0;
		}
		System.out.printf("%.5f\n",t);
		
		for (int i = 1; i < 1000; i++) {
		    for (int j = 0; j < i; j++) {
		        sum++;
		    }
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 1; i < 1000; i *= 2) {
		    for (int j = 0; j < 1000; j++) {
		        sum++;
		    }
		}
		System.out.println(sum);
		
		
	}

}
