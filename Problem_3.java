/*

Problem 2 : Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.


Time Complexity : O(n*m)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes


*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>(){};
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        List<Integer> res = new ArrayList<>();

        while(top <= bottom && left <= right){

            for(int i = left; i<=right;i++){
                res.add(matrix[top][i]); 
            }
            top++;

            for(int i = top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom){
                for(int i = right; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }



        return res;

    }
}