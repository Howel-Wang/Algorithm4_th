package cn.howel.sorts;

/**
 * @author howel
 * @version 1.0.0
 * @Description 冒泡排序
 */
public class BubbleSort {

    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                int temp = a[j];
                if (a[j] > a[j + 1]) {
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
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
            bubbleSort(array, array.length);
        }
        long l2 = System.currentTimeMillis();
        System.out.println("执行"+i+"次耗时（ms）： " + (l2 - l1));
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

}
