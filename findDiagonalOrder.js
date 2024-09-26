// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


var findDiagonalOrder = function(matrix) {
    if(matrix == null || matrix.length == 0) return new Array(0);
    let matrixArray = new Array(m*n);
    dir = 1;
    const m = matrix.length
    const n = matrix[0].length
   
    let i = 0, j = 0, idx = 0

    while(idx < m*n){
        matrixArray[idx] = matrix[i][j] 
        if(dir == 1){
            if(j == n -1){
                i++; dir = -1;
            }
            else if(i == 0) {
                j++; dir = -1
            }
            else {
                i--;j++
            }
        }
        else {
            if(i == m -1){
                j++; dir = 1;
            }
            else if(j == 0) {
                i++; dir = 1
            }
            else {
                j--;i++
            }
        }
        idx++
    }
    return matrixArray


};