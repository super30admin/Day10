// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 54: Spiral Matrix
// Approach: Array and Direction based logical operation
// Time Complexity: O(m x n)

class Solution
{
public:
    vector<int> spiralOrder(vector<vector<int>> &matrix)
    {
        vector<int> result;

        if (matrix.empty())
        {
            return result;
        }

        int m = matrix.size();
        int n = matrix[0].size();

        // initialize directions
        int top = 0;
        int bottom = m - 1;
        int right = n - 1;
        int left = 0;

        // Case to handle corner cases and exit
        while (top <= bottom && left <= right)
        {

            // Logic for left to right
            for (int i = left; i <= right; i++)
            {
                result.push_back(matrix[top][i]);
            }
            top++;

            // Logic for top to bottom
            for (int i = top; i <= bottom; i++)
            {
                result.push_back(matrix[i][right]);
            }
            right--;

            // Logic for right to left
            if (top <= bottom)
            {
                for (int i = right; i >= left; i--)
                {
                    result.push_back(matrix[bottom][i]);
                }
                bottom--;
            }

            // Logic for bottom to top
            if (left <= right)
            {
                for (int i = bottom; i >= top; i--)
                {
                    result.push_back(matrix[i][left]);
                }
                left++;
            }
        }

        // Return results array
        return result;
    }
};