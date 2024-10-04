// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class SpiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {
     int m = matrix.length;
     int n = matrix[0].length;

     List<Integer> result = new ArrayList<>();

     int top = 0, bottom = m-1, left = 0, right = n-1;

     while(top<=bottom && left <= right){
    
     if(top<=bottom && left <= right){
      for(int i = left; i <= right; i++ ){
        result.add(matrix[top][i]);
      }
      top++;
     }
      if(top<= bottom && left <= right){
       for(int i = top; i <= bottom; i++ ){
        result.add(matrix[i][right]);
      }
      right--;
    }
      if(top<=bottom && left <= right){

       for(int i = right; i >= left; i-- ){
        result.add(matrix[bottom][i]);
      }
      bottom--;
      }

       if(top<=bottom && left <= right){

       for(int i = bottom; i >= top; i-- ){
        result.add(matrix[i][left]);
      }
      left++;
       }

     }

     return result;
    }

    public static void main (String[] args)

    {
    
        DiagonalTraverse p = new DiagonalTraverse();
    
        int[][] arr = new int[][]{{2,3,1},{3,5,3},{7,100,101},{3,400,500}};
    
    
    
       int[] answer = p.findDiagonalOrder(arr);
       System.out.println(Arrays.toString(answer));
    
    }
}

//can be done recurssion apprach