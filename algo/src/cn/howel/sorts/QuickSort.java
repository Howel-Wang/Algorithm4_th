package cn.howel.sorts;


/**
 * @author howel
 * @version 1.0.0
 * @Description
 */
public class QuickSort {

    public static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n - 1);
    }

    public static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(a, p, r);
        quickSortInternally(a, p, q - 1);
        quickSortInternally(a, q + 1, r);
    }

    public static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];
                    a[j] = tmp;
                }
            }
        }
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;
        return i;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 7, 5, 8, 10, 6};
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(a, a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
