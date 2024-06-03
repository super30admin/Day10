// Time Complexity : O(m*n) m is number of rows and n is number of cols
// Space Complexity : O(1) because we're only using variables
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int> result;
        int rows = matrix.size();
        int cols = matrix[0].size();
        int top=0, bottom=rows-1;
        int left=0, right=cols-1;
        while(top<=bottom && left<=right)
        {
            if(top<=bottom)
            {
                for(int i=left;i<=right;i++)
                    result.push_back(matrix[top][i]);
            }
            top++;
            if(left<=right)
            {
                for(int i=top;i<=bottom;i++)
                    result.push_back(matrix[i][right]);
            }   
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                    result.push_back(matrix[bottom][i]);
            }
            
            bottom--;
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                    result.push_back(matrix[i][left]);
            }   
            left++;   
        }
        return result;
    }
};