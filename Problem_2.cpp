// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 498: Diagonal Traverse
// Approach: Array
// Time Complexity: O(m x n)

class Solution
{
public:
    vector<int> findDiagonalOrder(vector<vector<int>> &mat)
    {
        int m = mat.size();
        int n = mat[0].size();
        vector<int> result(m * n, 0);

        // Base Case
        if (mat.empty())
        {
            return result;
        }

        // Init Direction Flag
        int dir = 1;

        // Init Row and Column
        int row = 0;
        int col = 0;

        // Set index counter
        int index = 0;

        while (index < m * n)
        {

            // Add element to result array
            result[index] = mat[row][col];

            // Increment the index counter
            index++;

            // Bottom to Top
            if (dir == 1)
            {
                // Check if hitting the end of array (To take care of out of bound)
                // Increment and decrement row and col counter with a logic to move upward in diagonal way
                if (col == n - 1)
                {
                    dir = -1;
                    row++;
                }
                else if (row == 0)
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

            // Top to Bottom
            else
            {
                // Check if hitting the end of array (To take care of out of bound)
                // Increment and decrement row and col counter with a logic to move downward in diagonal way
                if (row == m - 1)
                {
                    dir = 1;
                    col++;
                }
                else if (col == 0)
                {
                    dir = 1;
                    row++;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
};