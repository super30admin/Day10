// Time Complexity : O(m*n) where m*n is mat length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[][]} mat
 * @return {number[]}
 */
 var findDiagonalOrder = function(mat) {
    if (mat === null) return [];
    let result = [];
    let m = mat.length;
    let n = mat[0].length;
    let i = 0, j = 0, index = 0;
    let dir = true;
    while(index < m*n) {
        result[index] = mat[i][j];
        index ++;
        //up dir in mat
        if(dir) {
            if(j == n-1) {
                dir = false;
                i++;
            } else if(i == 0) {
                dir = false;
                j++;
            } else {
                i--;
                j++;
            }
        } 
        //down dir in mat
        else {
             if(i == m-1) {
                dir = true;
                j++;
            } else if(j == 0) {
                dir = true;
                i++;
            } else {
                i++;
                j--;
            }
        }
    }
    return result;
};