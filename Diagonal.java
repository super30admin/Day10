/* Time Complexity: O(m*n) m*n matrix size
 * Space Complexity: O(1)
 * Leetcode: yes
 * Any Problems: no
 */
public class Diagonal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int index = 0;
        int i=0, j=0;
        boolean flag = true;

        while(index < result.length)
        {
            result[index] = mat[i][j];
            index++;
            if(flag)
            {
                if(j==n-1)
                {
                    i++;
                    flag = false;
                }
                else if(i==0)
                {
                    j++;
                    flag = false;
                }
                else
                {
                    i--;
                    j++;

                }
            }
            else
            {
                 if(i==m-1)
                {
                    j++;
                    flag = true;
                }
                else if(j==0)
                {
                    i++;
                    flag = true;
                }
                else
                {
                    i++;
                    j--;

                }

            }
        }
        return result;
    }
}
