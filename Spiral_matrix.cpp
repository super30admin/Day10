// Time Complexity : O(n * m)  ... n = row in matrix; m = columns in matrix           
// Space Complexity : O(n * m) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/spiral-matrix/

Given an m x n matrix, return all elements of the matrix in spiral order.
*/

/*
four variables are used to track the limit for each traverse.
After traverse in each direction these variables are updated.

Base condition (left<=right && top<=bottom) need to be checked insie the loop as well;
because there is possibility that those limits are reverted i.e. left>right or top>bottom inside the loop.
(Watch ckass video for details.)
*/

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {

        vector<int>result;
        int top = 0;
        int bottom = matrix.size()-1;
        int left = 0;
        int right = matrix[0].size()-1;
        
        while(left<=right && top<=bottom){

            for(int i = left; i<=right; i++){
                result.push_back(matrix[top][i]);
            }
            top++;

            for(int i = top; i<=bottom; i++){
                result.push_back(matrix[i][right]);
            }
            right--;

            if(left<=right && top<=bottom) {
                for(int i = right; i>=left; i--){
                    result.push_back(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right && top<=bottom) {
                for(int i = bottom; i>= top; i--){
                    result.push_back(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
};


/* Approach 2 */


class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].size()-1;
        int bottom = matrix.size()-1;

        int i = 0, j = 0, k = 0;
        int size = matrix.size() * matrix[0].size();
        vector<int>result;
        
        while(k<size){
            if(k<size) {
                for(i=left; i<=right; i++){
                    result.push_back(matrix[top][i]);
                    k++;
                }
            }
            top++;
            if(k<size) {
                for(i=top; i<=bottom; i++){
                    result.push_back(matrix[i][right]);
                    k++;
                }
            }
            right--;
            if(k<size) {
                for(j=right; j>=left; j--){
                    result.push_back(matrix[bottom][j]);
                    k++;
                }
            }
            bottom--;
            if(k<size) {
                for(i=bottom; i>=top; i--){
                    result.push_back(matrix[i][left]);
                    k++;
                }
            }                     
            left++;
        }

        return result;
    }
};
