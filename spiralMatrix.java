// Time Complexity :  O(MN) 
// Space Complexity : O(1) //As ouput array is not taken into account
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
*  initialize boundaries (top, bottom, left, right) to track the current layer of the matrix.
* Iterates through each layer, appending elements to the res list:
* Left to right along the top boundary.
* Top to bottom along the right boundary.
* Right to left along the bottom boundary (if applicable).
* Bottom to top along the left boundary (if applicable).
* It adjusts the boundaries after each complete traversal of a layer.
* It breaks out of the loop when the boundaries overlap or cross each other.
* Finally, it returns the res list containing all matrix elements in spiral order.
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //resultant array list
        List<Integer> res = new ArrayList<Integer>();
        //Edge case return res as it is if empty
        if(matrix.length == 0 || matrix[0].length == 0) return res;
        
        //take a top, bottom, left, right variable
        int top = 0; // top to 0
        int bottom = matrix.length-1; //bottom as number of rows 
        int left = 0; //left as 0
        int right = matrix[0].length-1; // right as number of columns 
        
        //Iterate over the matrix
        while(true){
            //Iterate from left to right and add the values to the result
            for(int i = left; i <= right; i++) res.add(matrix[top][i]);
            top++; //at the end increment top
            //If the value of left is greater than value of right || value of top is greater than bottom then out of bounds so break
            if(left > right || top > bottom) break;
            //iterate from top to bottom and add all the values to the res
            for(int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--; //decrement right at the end 
            //If the left crosses right or top crosses bottom them out of bound then break
            if(left > right || top > bottom) break;
            //Iterate from right to left and add the values to the res 
            for(int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            bottom--; // decrement the bottom value
            //If it goes out of bounds then break
            if(left > right || top > bottom) break;
            //Iterate from bottom to top and add all those values to the res 
            for(int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++; // increment the left
            //If it goes out of bounds then break
            if(left > right || top > bottom) break;
        }
        //return res 
        return res;
    }
    
}