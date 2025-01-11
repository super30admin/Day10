public class Solution
{
    public IList<int> SpiralOrder(int[][] matrix)
    {
        int m = matrix.Length;
        int n = matrix[0].Length;
        int top = 0, left = 0, right = n - 1, bottom = m - 1;
        var result = new List<int>();
        while (top <= bottom && left <= right)
        {
            for (int i = left; i <= right; i++)
            {
                result.Add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++)
            {
                result.Add(matrix[i][right]);
            }
            right--;
            if (top <= bottom)
            {
                for (int i = right; i >= left && left < n; i--)
                {
                    result.Add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right)
            {
                for (int i = bottom; i >= top && top < m; i--)
                {
                    result.Add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }
}