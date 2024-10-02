// Time Complexity : O(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//The algorithm traverses a 2D matrix diagonally, starting from the top-left corner and alternating between upward and downward directions.
//It keeps track of the current row and column indices, adjusting them based on the direction of movement until all elements in the matrix are processed.
//The results are collected in a one-dimensional array, which is returned after traversing the entire matrix.



using System;

public class Solution
{
    public int[] FindDiagonalOrder(int[][] mat)
    {
        int m = mat.Length;
        int n = mat[0].Length;

        int[] result = new int[m * n];
        int r = 0, c = 0;
        Boolean upDir = true;
        for (int i = 0; i < m * n; i++)
        {
            result[i] = mat[r][c];

            if (upDir)
            { //upward movement
                if (c == n - 1)
                {
                    r++; upDir = false;
                }
                else if (r == 0)
                {
                    c++; upDir = false;
                }
                else
                {
                    r--; c++;
                }
            }
            else
            {
                if (r == m - 1)
                {
                    c++; upDir = true;
                }
                else if (c == 0)
                {
                    r++; upDir = true;
                }
                else
                {
                    r++; c--;
                }
            }

        }
        return result;
    }
}

public class Program
{
    public static void Main()
    {
        Solution obj = new Solution();
        //int[] nums = new int[] { 1, 2, 3, 4, 5 };

        int[][] mat = new int[][]
            {
                new int[] {1, 2, 3},
                new int[] {4, 5, 6},
                new int[] {7, 8, 9}
            };
        //Output: [1,2,4,7,5,3,6,8,9]
        int[] result = obj.FindDiagonalOrder(mat);
        // Print array using string.Join()
        Console.WriteLine(string.Join(", ", result));
    }
}