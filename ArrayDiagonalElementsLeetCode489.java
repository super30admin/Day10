
/*
* approach: consider the edge cases while going up, and change the direction to down
*up case edges == row ==0, col == n-1
*down case = edge case - col ==0 and row ==m-1!!
* same way, for down direction, consider the edge cases and change the direction accordingly.
*
* Time Complexity: O(M*N) m=row, n = col
* Space Complexity: O(1)
* Whatever space we are using for storing, we are returning the same array, so that will not count towards space/ */


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[]{};
        
        int m = mat.length;
        int n = mat[0].length;
        int idx = 0;
        int dir =1; //up, down == -1;
        int row =0, col =0;
        
        int[] result = new int[m*n];
        
        while(idx < m*n)
        {
            result[idx++] = mat[row][col];
            
            
            if(dir ==1) //UP direction
            {
                if(col == n-1)
                {
                    dir = -1;
                    row++;
                }
                else if(row ==0)
                {
                    dir = -1;
                    col++;
                }
                else
                {
                    row--;
                    col++;
                }
            }
            else//DOWN direction
            {
                if(row == m-1)
                {
                    dir =1;
                    col++;
                }
                else if(col == 0)
                {
                    dir = 1;
                    row++;
                }
                else
                {
                    col--;
                    row++;
                }
            }
        }
        return result;
    }
}