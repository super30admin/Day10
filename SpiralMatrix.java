/*
    1. Time Complexity : O(m*n)
    2. Space Complexity : O(1)  
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */
import java.util.List;
import java.util.ArrayList;
class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length, cols = matrix[0].length;
        int startRow = 0, endRow = rows - 1, startCol = 0, endCol = cols - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; ++j) {
                res.add(matrix[startRow][j]);
            }
            ++startRow;
            for (int i = startRow; i <=endRow; ++i){
                res.add(matrix[i][endCol]);
            }
            --endCol;
            if (startRow > endRow) break;
            for (int j = endCol; j >=startCol; --j) {
                res.add(matrix[endRow][j]);
            }
            --endRow;
            if (startCol > endCol) break;
            for (int i = endRow; i >=startRow; --i) {
                res.add(matrix[i][startCol]);
            }
            ++startCol;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> res = spiralOrder(nums);
        System.out.println("Spiral Traversal of Matrix is");
        for (Integer n: res)
            System.out.print(n+" ");
    }
}