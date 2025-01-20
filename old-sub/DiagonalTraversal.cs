namespace LeetCodeSubmission.Arrays1;

public class DiagonalTraversal
{
    public int[] FindDiagonalOrder(int[][] mat)
    {
        int rows = mat.GetLength(0);
        int cols = mat[0].GetLength(0);
        int totalCount = rows * cols;
        
        int[] result = new int[rows * cols];

        string dir = "up";
        int row = 0;
        int col = 0;
        int itr = 0;
        
        while (totalCount != 0)
        {
            result[itr] = mat[row][col];
            itr += 1;
            totalCount -= 1;
            
            if (dir == "up")
            {
                if (row - 1 > -1 && col + 1 < cols)
                {
                    row -= 1;
                    col += 1;
                }
                else if (col+1 == cols)
                {
                    dir = "down";
                    row += 1;
                }
                else
                {
                    dir = "down";
                    col += 1;
                }
            }
            else
            {
                // dir == "down"
                if (col - 1 > -1 && row + 1 < rows)
                {
                    row += 1;
                    col -= 1;
                }
                else if (row+1 == rows)
                {
                    dir = "up";
                    col += 1;
                }
                else
                {
                    dir = "up";
                    row += 1;
                }
            }
        }

        return result;
    }
}