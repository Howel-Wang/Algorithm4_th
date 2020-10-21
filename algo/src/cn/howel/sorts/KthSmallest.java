package cn.howel.sorts;

/**
 * @author howel
 * @version 1.0.0
 * @Description 数组中第K大元素查找
 */
public class KthSmallest {

    public static int kthSmallest(int[] a, int K) {
        if (a == null || a.length < K) {
            return -1;
        }
        int partition = partition(a, 0, a.length - 1);
        while (partition + 1 != K) {
            if (partition + 1 < K) {
                partition = partition(a, partition + 1, a.length - 1);
            } else {
                partition = partition(a, 0, partition - 1);
            }
        }
        return a[partition];
    }

    public static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] <= pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, r);
        return i;
    }

    public static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 1, 6, 4, 9, 8};
        int kthsmallest = kthSmallest(a, 3);
        System.out.println(kthsmallest);
    }
}
