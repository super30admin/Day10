// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english : Consider 4 DIRECTIONS variable top,bottom,right & left.Increment top && left and decrement right && bottom with each iteration.Since we iterating over each elemnt so time complexity is O(n).
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let bottom = matrix.length-1;
    let right = matrix[0].length-1;
    let top = 0,left = 0;
    let result=[];
    let size = matrix.length*matrix[0].length;
    while(result.length<size)
    {
        for(let i=left;i<=right && result.length<size;i++)
        {
            result.push(matrix[top][i]);
        }
        top++;
        for(let i=top;i<=bottom && result.length<size;i++)
        {
            result.push(matrix[i][right]);
        }
        right--;
        for(let i=right;i>=left && result.length<size;i--)
        {
            result.push(matrix[bottom][i]);
        }
        bottom--;
        for(let i=bottom;i>=top && result.length<size;i--)
        {
            result.push(matrix[i][left]);
        }
        left++;
    }
    return result;
};