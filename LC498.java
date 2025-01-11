// TC: O(m*n)
// SC: O(1)

// Approach 1:
public class LC498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0, j = 0;
        int ans[] = new int[m * n];
        int ansIdx = 0;
        int dir = 1;
        while (ansIdx < m * n) {
            ans[ansIdx++] = mat[i][j];
            i = i - dir;
            j = j + dir;

            if (!(i >= 0 && i < m && j >= 0 && j < n))
                dir = -1 * dir;

            if (i >= m) {
                i--;
                j += 2;
            } else if (j >= n) {
                j--;
                i += 2;
            } else if (i < 0)
                i++;
            else if (j < 0)
                j++;
        }
        return ans;
    }
}

// Approach 2:
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0, j = 0;
        int ans[] = new int[m * n];
        int dir = 1;
        for (int x = 0; x < m * n; x++) {
            ans[x] = mat[i][j];
            if (dir == 1) {
                if (j == n - 1) {
                    i++;
                    dir = -1;
                } else if (i == 0) {
                    j++;
                    dir = -1;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) {
                    j++;
                    dir = 1;
                } else if (j == 0) {
                    i++;
                    dir = 1;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}
