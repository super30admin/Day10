https://leetcode.com/problems/spiral-matrix/
// Time Complexity : O(m * n)
// Space Complexity : O(m * n) result array
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// To derive at all the elements in a spiral order, we need to initalize the boundaries using 
//top, right, bottom, left pointers and add in the same order. In each row or col add, reduce 
// the pointers spaces to not repeat items and move towards next spiral in the matrix. 
// Also check if the base condition holds since we modify the pointers after a row or col add. 

// Your code here along with comments explaining your approach
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let top = 0;
    let bottom = matrix.length-1;
    let left = 0; 
    let right = matrix[0].length -1;
    let res = [];
    //Run while loop for the directions using the pointers and reduce the space in each loop
    while(left<= right && top <=bottom){
        //add all the top row elements
        for(let i=left; i<=right; i++){
            res.push(matrix[top][i]);
        }
        top++;
        //add all the right row elements
        for(let i=top; i<=bottom;i++){
            res.push(matrix[i][right]);
        }
        right--;

        //add all the bottom row elements; check if the pointer condition still holds since they have been previously modified
        if(top <=bottom){
            for(let i=right; i>=left;i--){
                res.push(matrix[bottom][i]);
            }
            bottom--;
        }
        //add all the left row elements; check if the pointer condition still holds since they have been previously modified
        if(left<= right){
            for(let i=bottom; i>=top;i--){
                res.push(matrix[i][left]);
            }
            left++;
        }
    }
    return res;

};