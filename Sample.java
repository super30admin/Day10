// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // Approach:   1. Define a array ans array to store the results.
        //     2. The ans[i] element will be product of previous number in ans and the previous number in nums.
        //     3. Similarly for right half the product of the right most elements with a temp variable rProd and then update rProd regularly with previous nums in nums array.
        int n=nums.length;
        int[] ans=new int[n];
        
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int rProd=1;
        for(int j=n-1;j>=0;j--){
            ans[j]*=rProd;
            rProd*=nums[j];
        }
        
        return ans;
        
        
    }
}


// Time Complexity :O(m*n)
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] ans=new int[m*n];
        boolean check=true;
        int row=0,col=0;
        for(int i=0;i<m*n;i++){
            ans[i]=mat[row][col];
            if(check){
                if (col == n - 1) {
                    row++;
                    check = false;
                } else if (row == 0) {
                    col++;
                    check = false;
                } else {
                    row--;
                    col++;
                }
                
            }
            else{
                if(row==m-1){
                    col++;
                    check=true;
                }
                else if(col==0){
                    row++;
                    check=true;
                }
                else{
                    col--;
                    row++;
                }
            }
        }
        return ans;
    }
}


// Time Complexity :O(m*n)
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //Approach:
        // 1.Find top,bottom,left,right var's of the given matrix. Then, for each outter spiral make a condition on when to be added inside the ans ArrayList.
        //     2. For left to right be sure to update the top count by 1 similary for top to bottom decrement right count by 1, for top to bottom again decrement bottom and for left to right increment left by 1.
        //     3. Be sure to check if the condition for base case is satisfied throughout.
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> ans=new ArrayList<Integer>();
        int top=0,bottom=m-1,left=0,right=n-1;
        while((top<=bottom) && (left<=right)){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                ans.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int z=right;z>=left;z--){
                    ans.add(matrix[bottom][z]);
                }
            }
            bottom--;
            if(left<=right){
                for(int k=bottom;k>=top;k--){
                    ans.add(matrix[k][left]);
                }
            }
            left++;
        }
        return ans;
    }
}