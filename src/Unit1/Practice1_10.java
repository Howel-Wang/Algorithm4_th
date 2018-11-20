package Unit1;
/*
	1.1.10
	下面这段代码有什么问题？

 	答：会出现Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	The local variable a may not have been initialized
*/



public class Practice1_10 {
	public static void show(String[] args) {
		int[] a;
		for(int i = 0;i<10;i++) {
//			a[i] = i*i;
		}
		
	}
}
