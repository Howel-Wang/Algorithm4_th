
/*
	1.1.13
	编写一段代码，打印出一个M行N列的二维数组的转置（交换行和列）
*/
public class Practice1_1_13 {
	
	public static void main(String[] args) {
		int m = 20,n = 20;
		int[][] a = new int[m][n];
		int[][] b = new int[n][m];
		for(int i=0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++){
				a[i][j] = i;
				b[j][i] = i;
				
			}
		}
		for(int i = 0; i<a.length; i++) {
			for(int j = 0;j<a[0].length; j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
