// Time Complexity: O(m*n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Initialize the result vector with the size of the matrix.
// 2. Traverse the matrix in a spiral order and keep updating the result vector.
// 3. Make sure to check corner conditions in particular top right and bottom left.
// 4. Return the result vector.



class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> result;
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                result.push_back(matrix[top][j]);
            }
            top++;

            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++){
                    result.push_back(matrix[i][right]);
                }
                right--;
            }

            if(top <= bottom && left <= right){
                for(int j = right; j >= left; j--){
                    result.push_back(matrix[bottom][j]);
                }
                bottom--;
            }
            
            if(top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--){
                    result.push_back(matrix[i][left]);
                }
                left++;
            }
            
        }
        return result;

    }
};