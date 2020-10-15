package cn.howel.sorts;

/**
 * @author howel
 * @version 1.0.0
 * @Description
 */
public class InsertionSort {

    public static void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            int value = a[i];
            int j = 1;
            for (; j >= 0; --j) {
                if (a[j] < value) {
                    a[j - 1] = a[j];
                } else {
                    break;
                }
            }
            a[j - 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] array = {4,5,6,1,3,7,2};
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
        insertionSort(array, array.length);
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
    }

}
