// Time Complexity : O(m*n), m=number of rows, n=number of columns
// Space Complexity : O(m*n), m=number of rows, n=number of columns
// Did this code successfully run on Leetcode : Yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0 || matrix==null)
            return new ArrayList<Integer>();
        
        int m=matrix.length, n=matrix[0].length;
        int top=0, bottom=m-1, left=0, right=n-1;
        List<Integer> result = new ArrayList<>();
        while(top<=bottom && left<=right) {
            //left to right
            for(int i=left; i<=right; i++) 
                result.add(matrix[top][i]);
            top++;
            //top to bottom
            for(int i=top; i<=bottom; i++)
                result.add(matrix[i][right]);
            right--;
            //right to left
            if(top<=bottom)
                for(int i=right; i>=left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            //bottom to top
            if(left<=right)
                for(int i=bottom; i>=top; i--)
                    result.add(matrix[i][left]);
                left++;
        }
        return result;
    }
}