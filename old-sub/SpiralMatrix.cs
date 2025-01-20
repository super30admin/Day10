namespace LeetCodeSubmission.Arrays1;

public class SpiralMatrix
{
    public IList<int> SpiralOrder(int[][] matrix)
    {
        int rows = matrix.GetLength(0);
        int cols = matrix[0].GetLength(0);
        int totalCount = rows * cols;
        
        // for the result
        IList<int> result = new List<int>();
        int left = 0;
        int right = cols - 1;

        int top = 0;
        int bottom = rows - 1;
        
        // start 
        int row = 0;
        int col = 0;

        // set the current direction
        string dir = "left-to-right";
        
        while (totalCount != 0)
        {
            // add the result to the list
            result.Add(matrix[row][col]);
            totalCount -= 1;
            
            // base-condition
            if (totalCount == 0)
            {
                break;
            }
            
            // logic-case
            if (dir == "left-to-right")
            {
                if (col + 1 <= right)
                {
                    col += 1;
                }
                else
                {
                    top += 1;
                    row += 1;
                    dir = "top-to-bottom";
                }
            }
            else if (dir == "top-to-bottom")
            {
                if (row + 1 <= bottom)
                {
                    row += 1;
                }
                else
                {
                    right -= 1;
                    col -= 1;
                    dir = "right-to-left";
                }
                
            }else if (dir == "right-to-left")
            {
                if (col - 1 >= left)
                {
                    col -= 1;
                }
                else
                {
                    bottom -= 1;
                    row -= 1;
                    dir = "bottom-to-top";
                }
            }
            else if (dir == "bottom-to-top")
            {
                if (row - 1 >= top)
                {
                    row -= 1;
                }
                else
                {
                    left += 1;
                    col += 1;
                    dir = "left-to-right";
                }
                
            }
        }
        
        return result;
    }
}