// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - array bounds check and up/down flag used to control the matrix traversal

// Your code here along with comments explaining your approach

/**
 *https://leetcode.com/problems/diagonal-traverse/ 
 *
 *Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

 

Example:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]

Strategy- array bounds check and up/down flag used to control the matrix traversal, always first check bounds for 
row or column whichever reaches max as it can go out of bound. 

 */

class DiagonalTraversal {
	 public int[] findDiagonalOrder(int[][] matrix) {
	        
	        if(matrix == null || matrix.length==0) {
	            return new int[0];
	        }
	       
	        int m=matrix.length, n = matrix[0].length;
	        int[] res = new int [m*n];
	        int cnt = 0;
	         
	        int i=0,j=0;
	        res[cnt++] = matrix[i][j];
	        
	        boolean up = true;
	        while(cnt < m*n) {
	            if(up){
	             if(i-1 >=0 && j + 1 < n) {
	                 i = i -1;
	                 j = j + 1;
	             }else{
	                 up =false;
	                 //while going up, j is reaching max so check bounds check for j first
	                 if(j+1<n) {
	                     j = j + 1;
	                 }else {
	                     i = i + 1;
	                 }
	             }   
	            }else if (!up) {
	                if(i+1 < m && j -1 >=0) {
	                    i = i+ 1;
	                    j = j - 1;
	                } else {
	                    up = true;
	                    // while going down, i is reaching max so check bounds check for i first
	                    if(i+1 <m) {
	                        i = i+1;
	                    } else {
	                        j = j+1;
	                    }
	                }
	            }
	            res[cnt++] = matrix[i][j];
	        }
	        return res;
	    }
}