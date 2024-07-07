//https://leetcode.com/problems/diagonal-traverse/
// Time Complexity : O(n)
// Space Complexity : O(1) // not including the auxilary space used for res
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// To traverse diagonally, we first need to identify direction to travel and boundaries to travel within and for entire length of matrix, i.e. m*n.
// When we go out of boundary then we switch directions, otherwise for upward direction, we reduce row by one and increase cols by one.
// We do the opposite for dowanward directions. 

// Your code here along with comments explaining your approach
/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var findDiagonalOrder = function(mat) {
    if(mat == null || mat.length == 0) return [];
    var rows = mat.length;
    var cols = mat[0].length;
    var res = [];
    let r = 0, c=0, index = 0, dir = true;

    while(index < rows*cols){
        res[index] = mat[r][c];
        if(dir){
            if(r == 0 && c!= cols-1){
                c++; dir = false;
            }
            else if(c== cols -1){
                r++; dir = false;
            }
            else{
                r--; c++;
            }
        }
        else {
            if(c == 0 && r!= rows-1){
                r++; dir=true;
            }
            else if(r == rows-1){
                c++; dir=true;
            }
            else{
               
                c--; r++;
            }
        }
        index++;
    }

    return res;

};