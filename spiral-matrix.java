
// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: i have done this by using 4variables like 
// left,right,top and bottom by checking edge cases increasing variables as well as filling the result.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        while(top<=bottom && left<=right){ //O(m*n)
         for(int i=left;i<=right;i++){
                 result.add(matrix[top][i]);
         }
         top++; 
         if(left<=right){
          for(int i=top;i<=bottom;i++){
                  result.add(matrix[i][right]);
                
         }  
          right--;
         }
          if(top<=bottom ){ 
             for(int i=right;i>=left;i--){
                  result.add(matrix[bottom][i]);
               
         }  
           bottom--; }
        if(left<=right){
           for(int i=bottom;i>=top;i--){
                  result.add(matrix[i][left]);
                 
         }  
         left++; 
        }       
        }
        return result;
        
    }
}