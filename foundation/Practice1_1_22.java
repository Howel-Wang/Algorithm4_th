package foundation;
/*
	1.1.22
	使用1.1.6.4节中的rank()递归方法重新实现BinarySearch并跟踪该方法的调用。每当该方法
	被调用时，打印出它的参数lo和hi并按照递归的深度缩进。提示：为递归方法添加一个参数来保存
	递归的深度。
	1.1.6.4中的rank():
	public static int rank(int key, int[] a) {
    return rank(key, a, 0, a.length - 1);
	}
	public static int rank(int key, int[] a, int lo, int hi) {
    //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
    if (lo > hi)
        return -1;
    int mid = lo + (hi - lo) / 2;
    if(key < a[mid])
        return rank(key, a, lo, mid - 1);
    else if (key > a[mid])
        return rank(key, a, mid + 1, hi);
    else
        return mid;
}
*/

public class Practice1_1_22 {
	public static int rank(int key, int[] a) {
		return rank(key, a,0,16,1);
	}
	public static int rank(int key, int[] a, int lo, int hi, int deep){
		if(lo > hi){
			return -1;
		}
		for(int i = 0; i < deep;i++){
			System.out.print("	");
		}
		System.out.println("lo: "+lo+"hi: "+hi);
		int mid = lo + (hi - lo)/2;
		if(key < a[mid]){
			return rank(key, a, lo, mid - 1,deep+1);
		}else if (key > a[mid]){
			return rank(key, a, mid + 1, hi,deep+1);
		}else {
			return mid;
		}
	}

	public static void main(String[] args){
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++){
			a[i] = i;
		}
		rank(45, a);
	}
}
