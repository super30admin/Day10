public class Solution
{
    public int[] FindDiagonalOrder(int[][] mat)
    {
        int m = mat.Length, n = mat[0].Length, dir = 1;
        int[] result = new int[m * n];

        int index = 0, row = 0, column = 0;
        while (index < m * n)
        {
            result[index++] = mat[row][column];
            if (dir == 1)
            {
                if (column == n - 1)
                {
                    dir = -1;
                    row++;
                }
                else if (row == 0)
                {
                    dir = -1;
                    column++;
                }
                else
                {
                    row--;
                    column++;
                }
            }
            else
            {
                if (row == m - 1)
                {
                    dir = 1;
                    column++;
                }
                else if (column == 0)
                {
                    dir = 1;
                    row++;
                }
                else
                {
                    row++;
                    column--;
                }
            }
        }
        return result;
    }
}