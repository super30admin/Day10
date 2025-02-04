//TC: O(n)
//SC: Auxiliary O(1)
//Did it run on leetcode: Yes
public class Solution_DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int size = m*n;
        int[] result = new int[size];

        int r = 0;
        int c = 0;
        int ind = 0;
        boolean dir = true;
        while(ind < size){
            result[ind] = matrix[r][c];
            ind++;
            if(dir){
                if(c == n-1){
                    r++;
                    dir = false;
                } else if(r == 0){
                    c++;
                    dir = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(r == m-1){
                    c++;
                    dir = true;
                } else if(c == 0){
                    r++;
                    dir = true;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
