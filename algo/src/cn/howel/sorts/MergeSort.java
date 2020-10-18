package cn.howel.sorts;

/**
 * @author howel
 * @version 1.0.0
 * @Description 归并排序
 */
public class MergeSort {

    public static void mergeSort(int[] a, int n) {
        mergeSortInternally(a, 0, n - 1);
    }

    /*
        递归调用函数
     */
    public static void mergeSortInternally(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = p + (r - p) / 2;
        // 分治递归
        mergeSortInternally(a, p, q);
        mergeSortInternally(a, q + 1, r);
        // 将a[p...q],a[q+1...r]合并为a[p...r]
        merge(a, p, q, r);
    }

    /*
        合并
     */
    public static void merge(int[] a, int p, int q, int r) {

        // 初始化变量i，j，k
        int i = p;
        int j = q + 1;
        int k = 0;
        //申请和a数组一样大的tmp数组
        int[] tmp = new int[r - p + 1];
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }
        // 判断哪个数组中有剩余数据
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        // 将剩余数组拷贝到临时数组中
        while (start <= end) {
            tmp[k++] = a[start++];
        }
        for (i = 0; i <= r - p; i++) {
            a[p + i] = tmp[i];
        }

    }

    public static void main(String[] args) {
        int[] a = {3, 4, 6, 2, 7, 1, 5};
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergeSort(a, a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
