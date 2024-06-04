
//Problem 1
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int rp=1;
       int left[]=new int[nums.length];
       left[0]=1;
       int n=nums.length;
     
       for(int i=1;i<n;i++)
       {
        left[i]= nums[i-1]*left[i-1];
       } 
      
       
 
       for(int i=n-2;i>=0;i--)
       {
        rp=rp*nums[i+1];
        left[i]=rp*left[i];
       }
       return left;
    }
}
//Problem 2
// Time Complexity :O(n)
// Space Complexity :o(m*n)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return new int[]{};
        int n=mat.length;
        int m=mat[0].length;
        int res[]=new int[m*n];
        int dir=1;
        int i=0;
        int row=0,col=0;
       while(row<n && col<m)
        {
                if(row<n&&col<m){
            res[i++]=mat[row][col];
           }
            if(dir==1)
       {
                if(col==m-1)
                { 
                    dir=-1;
                    row++;
                }
                else if(row==0)
                {
                    dir=-1;
                    col++;
                }
                else{
                    
                    col++;
                    row--;
                }
            }
            else{
          
                if(row==n-1)
                {
                    dir=1;
                    col++;
                }
                else if(col==0)
                {
                    dir=1;
                    row++;
                }
                else{
                   
                    row++;
                    col--;
                }
            }
    }
        
        return res;
    }
}
//Problem 3
// Time Complexity :O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null|| matrix.length==0) return new ArrayList<>();
        List<Integer> result= new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1;
        int left=0,right=n-1;
        while(top<=bottom && left<=right)
        {
            //move from left to right
            for(int j=left;j<=right;j++)
            {
                result.add(matrix[top][j]);
            }
            top++;
            if(top<=bottom && left<=right)
            {
                for(int i=top;i<=bottom;i++)
                {
                    result.add(matrix[i][right]);

                }
                right--;
            }
            // move from right to left
            if(top<=bottom && left<=right)
            {
                for(int j=right;j>=left;j--)
                {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(top<=bottom&& left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}