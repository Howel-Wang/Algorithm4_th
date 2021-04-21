package cn.howel.sorts;

/**
 * @author howel
 * @version 1.0.0
 * @Description 插入排序, 希尔排序
 */
public class InsertionSort {

    /*
        插入排序
     */
    public static void insertionSort(int[] a, int length) {
        if (length <= 1) {
            return;
        }
        for (int i = 0; i < length; ++i) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    /*
        希尔排序
     */
    public static void shellSort(int[] arr, int length) {
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 5, 2, 3, 1, 4, 6};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
//        insertionSort(array, array.length);
        long l1 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            shellSort(array, array.length);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("耗时（ms）： " + (l2 - l1));

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
