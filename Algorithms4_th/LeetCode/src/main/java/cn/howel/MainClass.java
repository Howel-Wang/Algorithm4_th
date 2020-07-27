package cn.howel;

import java.util.Arrays;

public class MainClass {


    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if((matrix==null||matrix.length==0)||(matrix.length==1&&matrix[0].length==0)) {
            return false;
        }
        for(int i = 0; i < matrix.length; i++) {
            for ( int j = 0; j < matrix[i].length; j++) {
                if (target < matrix[i][j]) {
                    break;
                }else if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{-1,3}};
        System.out.println(findNumberIn2DArray(matrix, 3));

    }
}