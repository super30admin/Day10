// https://leetcode.com/problems/spiral-matrix/description/
// Time Complexity : O(n*m) where n is the number of rows and m is the number of columns
// Space Complexity : O(n*m) where n is the number of rows and m is the number of columns
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Iterate through the matrix, copy the first row by incrementing the start of the column.
// copy the last column, by incrementing the start of the row, copy the last column by decrementing end of the column;
// copy the first row by decrementing the end of the row. Continue this until start of row <= end of row and start of col <=  end of col

// Your code here along with comments explaining your approach

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();
        int sr = 0;
        int er = rows-1;
        int sc = 0;
        int ec = cols-1;
        vector<int> ans;
        while(sr<=er && sc<=ec){
            for(int j=sc; j<=ec; j++){
                ans.push_back(matrix[sr][j]);
            }
            sr++;
            for(int i=sr; i<=er; i++){
                ans.push_back(matrix[i][ec]);
            }
            ec--;
            if(sr<=er){
                for(int j=ec; j>=sc; j--){
                    ans.push_back(matrix[er][j]);
                }
            }
            er--;
            if(sc<=ec){
                for(int i=er; i>=sr; i--){
                    ans.push_back(matrix[i][sc]);
                }
            }
            sc++;
        }
        return ans;
    }
};