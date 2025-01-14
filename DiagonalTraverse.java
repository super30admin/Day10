//TC: O(m*n)
//SC: O(1)
//approach: maintaining dir, curRow, curCol to check boundary conditions for diagonal traversal

import java.util.Arrays;

public class DiagonalTraverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        int l = mat.length * mat[0].length;
        int[] result = new int[l];
        if(l == 1){
            return new int[]{mat[0][0]};
        }
        if(mat.length == 1){
            result = mat[0];
            return result;
        }
        if(mat[0].length == 1){
            for(int i=0;i<l;i++){
                result[i] = mat[i][0];
            }
            return result;
        }

        int curRow = 0;
        int curCol = 0;
        boolean dir = true;
        for (int i = 0; i < l; i++) {
            result[i] = mat[curRow][curCol];
            if (curCol == 0) {
                if (dir) {
                    curCol++;
                    if (curRow != 0) {
                        curRow--;
                    } else dir = false;
                } else {
                    dir = true;
                    if (curRow == mat.length - 1) {
                        curCol++;
                    } else {
                        curRow++;
                    }
                }
            } else if (curCol == mat[0].length - 1) {
                if (dir) {
                    dir = false;
                    if (curRow != mat.length - 1) {
                        curRow++;
                    }
                } else {
                    if (curRow != mat.length - 1) {
                        curRow++;
                        curCol--;
                    }
                }
            } else {
                if (dir) {
                    if (curRow != 0) {
                        curRow--;
                    } else {
                        dir = false;
                    }
                    curCol++;
                } else {
                    if (curRow != mat.length - 1) {
                        curRow++;
                        curCol--;
                    } else {
                        dir = true;
                        curCol++;
                    }

                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }

}
