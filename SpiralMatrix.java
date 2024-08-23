// Time Complexity : O(m*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i = 0;
        int j = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int right = n-1;
        int left = 0;
        int top = 0;
        int bottom = m-1;
        List<Integer> list = new ArrayList<>();
        while(list.size()<m*n){
            while(j<=right){
                list.add(matrix[i][j]);
                j++;
            }
            j--;
            i++;
            top++;
            while(i<=bottom){
                list.add(matrix[i][j]);
                i++;
            }
            i--;
            j--;
            right--;
            while(list.size()<m*n && j >= 0 && j>=left){
                list.add(matrix[i][j]);
                j--;
            }
            j++;
            i--;
            bottom--;
            while(list.size()<m*n && i >= 0 && i>=top){
                list.add(matrix[i][j]);
                i--;
            }
            i++;
            // System.out.println(top);

            // System.out.println(matrix[i][j]);

            j++;
            left++;
        }
        return list;
    }
}
