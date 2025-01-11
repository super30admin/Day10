// Time complexity: O(m*n)
// Space complexity: O(m*n) including output array. If output array is considered as no space, then it could be O(1)


import java.util.ArrayList;
import java.util.List;

class LC54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        List<Integer> ans = new ArrayList<>();
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            if (top > bottom)
                continue;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            if (left > right)
                continue;
            for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            if (top > bottom)
                continue;
            for (int i = bottom; i >= top; i--) {
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}