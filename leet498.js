// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english : using map to note down each indices sum and values on those indices.
/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var findDiagonalOrder = function(mat) {
    var row = mat.length;
    var col = mat[0].length;
    let map = {};
    let arr=[];
    for(let i=0;i<row;i++)
    {
     for(let j=0;j<col;j++)
     {   
         var key = i+j
         var value = mat[i][j];
         map[key] ? map[key].push(value) : map[key] = [value];
     }
    }
    for(let key in map)
    {
        if(+key%2===0)
        {
            arr.push(...map[key].reverse());
        }
        else
         arr.push(...map[key]);
    }
    return arr;
};