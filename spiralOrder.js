// Time Complexity : O(m*n) where m*n is mat length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let m = matrix.length;
    let n = matrix[0].length;
    let left = 0, right = n - 1, top = 0, bottom = m - 1;
    let result = [];
    while(top <= bottom && left <= right) {
        //Top row
        for(let j = left; j <= right; j++) {
            result.push(matrix[top][j]);
        }
        top++;
        
        //right Column
        if(top <= bottom) {
            for(let i = top; i <= bottom; i++) {
                result.push(matrix[i][right]);
            }
        }
        right--;
        
        //Bottom Row
        if(top <= bottom && left <= right) {
            for(let j = right; j >= left; j--) {
                result.push(matrix[bottom][j]);
            }
        }
        bottom--;
        
        //Left Column
        if(top <= bottom && left <= right) {
            for(let i = bottom; i >= top; i--) {
                result.push(matrix[i][left]);
            }
        }
        left++;
    }
    return result;
};