// Time Complexity: O(m*n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Initialize the result vector with the size of the matrix.
// 2. Traverse the matrix diagonally and keep updating the result vector.
// 3. If the direction is up, then check if the current element is at the last column or first row. If yes, then change the direction.
// 4. If the direction is down, then check if the current element is at the last row or first column. If yes, then change the direction.
// 5. Return the result vector.


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size(); 
        int n = mat[0].size(); 
        vector<int> result(m*n); 
        int index = 0, i = 0, j = 0; 
        bool dir = true;
        while(index < m*n){
            result[index] = mat[i][j];
            index++;
            if(dir == true){
                //UP
                if(j == n - 1){
                    i++;
                    dir = false;
                }else if(i == 0 ){
                    j++;
                    dir = false;
                }else{
                    i--;
                    j++;
                }
            }
            else{
                //DOWN
                if(i == m - 1){
                    j++;
                    dir = true;
                }else if(j == 0){
                    i++;
                    dir = true;
                }else{
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
};