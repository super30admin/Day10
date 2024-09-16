class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> res = new ArrayList<>();
        if(mat == null || mat.length == 0) {
            return res;
        }
        int m, n, top, bottom, left, right, i, j;
        m = mat.length;
        n = mat[0].length;
        top = 0;
        bottom = m - 1;
        left = 0;
        right = n - 1;
        while(left <= right && top <= bottom) {
            for(j = left; j <= right; j++) {
                res.add(mat[top][j]);
            }
            top++;
            if(left <= right && top<= bottom) {
                for(i = top; i <= bottom; i++) {
                    res.add(mat[i][right]);
                }
            }
            right--;
            if(left <= right && top<= bottom) {
                for(j = right; j >= left; j--) {
                    res.add(mat[bottom][j]);
                }
            }
            bottom--;
            if(left <= right && top<= bottom) {
                for(i = bottom; i >= top; i--) {
                    res.add(mat[i][left]);
                }
            }
            left++;
        }
        return res;
    }
}