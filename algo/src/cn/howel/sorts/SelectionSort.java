package cn.howel.sorts;


/**
 * @author howel
 * @version 1.0.0
 * @Description 选择排序
 */
public class SelectionSort {

    public static void selectionSort(int[] a, int n) {

        if (n < 2) {
            return;
        }
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 2, 1, 5, 6, 7, 8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(array, array.length);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
