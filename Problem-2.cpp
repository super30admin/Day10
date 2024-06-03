// Time Complexity : O(m*n) m is number of rows and n is number of cols
// Space Complexity : O(1) because we're only using variables
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> result;
        int rows = mat.size();
        int cols = mat[0].size();
        int dir = 1, row=0, col=0;
        while(result.size() != rows*cols)
        {
            result.push_back(mat[row][col]);
            if(dir==1)
            {
                if(col==cols-1)
                {
                    dir=-1;
                    row++;
                }
                else if(row==0)
                {
                    dir=-1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }

            else if(dir==-1)
            {
                if(row==rows-1)
                {
                    dir=1;
                    col++;
                }
                else if(col==0)
                {
                    dir=1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
};