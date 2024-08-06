// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// 498. Diagonal Traverse
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int m = mat.length;
        int n = mat[0].length;
        List<Integer> result = new ArrayList<>();

        // Traverse all possible diagonals
        for (int d = 0; d < m + n - 1; d++) {
            List<Integer> diagonal = new ArrayList<>();
            
            // Determine the starting point of the diagonal
            int r = d < n ? 0 : d - n + 1;
            int c = d < n ? d : n - 1;

            // Collect elements for the current diagonal
            while (r < m && c >= 0) {
                diagonal.add(mat[r][c]);
                r++;
                c--;
            }

            // Append the diagonal to the result
            if (d % 2 == 0) {
                // For diagonals with even indices, reverse the order
                for (int i = diagonal.size() - 1; i >= 0; i--) {
                    result.add(diagonal.get(i));
                }
            } else {
                // For diagonals with odd indices, maintain the order
                result.addAll(diagonal);
            }
        }

        // Convert the result list to an array
        return result.stream().mapToInt(i -> i).toArray();
    }
}