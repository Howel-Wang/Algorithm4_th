package Unit1;
/*
	以下代码段会打印出什么结果？
	int[] a = new int[10]
	for(int i=0; i<10; i++)
		a[i] = 9-i;
	for(int i=0; i<10; i++)
		a[i] = a[a[i]]
	for(int i=0; i<10; i++)
		System.out.printn(i);
*/
public class Practice1_12 {

	public static void main(String[] args) {
		int[] a = new int[10];
			for(int i=0; i<10; i++) {
				a[i] = 9-i;
			}
			for(int i=0; i<10; i++){
				a[i] = a[a[i]];
			}	
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
	}

}
