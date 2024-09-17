//Time Complexity: O(mn)
//Space Complexity: O(mn)
//LeetCode: Yes

//Initialize the pointers at the boundaries. 
//Based on the traversal direction , increment or decrement the pointers and store the result. 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List result = new ArrayList();
        if(matrix.length == 0 || matrix == null) return result;
        
        int m = matrix.length,n = matrix[0].length;
        
        int left = 0,right =n-1, top = 0, bottom = m-1;
        
        while(left <=right && top<= bottom) {
            
            for(int i = left; i<=right;i++)result.add(matrix[top][i]);
            top++;
            
            for(int i = top; i<=bottom; i++)result.add(matrix[i][right]);
             right--;
            if(left<=right){
            for(int i =right; i>=left;i--)result.add(matrix[bottom][i]);}
            bottom--;
            
            if(top<=bottom){
            for(int i = bottom; i>=top; i--)result.add(matrix[i][left]);}
            left++;
        }
        return result;
        
    }
}