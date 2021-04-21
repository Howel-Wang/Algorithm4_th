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
        int[] array = {7, 5, 2, 3, 1, 4, 6};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 0;
        long l1 = System.currentTimeMillis();
        for (; i < 100000000; i++) {
            selectionSort(array, array.length);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("执行"+i+"次耗时（ms）： " + (l2 - l1));
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

}
