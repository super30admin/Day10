/**
*  SpaceComplexity: O(M*N)
  */

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length; 
        int col = mat[0].length;
        int[] output = new int[row * col];
        boolean dire = true;
        int m=0, n=0;
        for(int i=0; i< row * col; i++) {
            output[i] = mat[m][n];
                if(dire) {
                     if(n == col -1) {
                        m++;
                        dire = false;
                    } else if(m == 0) {
                        n++;
                        dire = false;
                    }else {
                        m--;
                        n++;
                    }

                } else {
                    if(m == row -1) {
                        n++;
                        dire = true;
                    }else if(n == 0) {
                        m++;
                        dire = true;
                    } else {
                        m++;
                        n--;
                    }
                }
        }
        return output;
    }
}
