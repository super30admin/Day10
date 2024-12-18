/*
    Leetcode problem 498: Diagonal Traverse
    T.C: O(m * n) :: S.C: O(1) - Expected to return an array of size m * n
    
    Solved using brute force solution: The matrix has traversed atleast once,
    therefore traverse the matrix using a direction variable and update the 
    rows and cols in the direction of the traversal. If you are going down then
    increment the row and decrement the column. Vice versa for upward direction.
    Refer to the comments in the solution for the edge cases (i.e b/w 0,0 & m,n)
*/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[] {};

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int r = 0, c = 0;
        int idx = 0, dir = 1; // 1 -> Upward Direction : -1 -> Downward Direction

        while(idx < m * n) {
            result[idx] = mat[r][c];
            idx++;
            if (dir == 1) {
                //If you reach the last col: change dir and start moving down from the next row & same col
                if (c == n - 1) {
                    dir = -1;
                    r++;
                } else if (r == 0) { //If you reach first row: change dir and move down from next col 
                    dir = -1;
                    c++;
                } else { //Move diagonally right and up until you reach first col or first row
                    r--;
                    c++;
                }//Note: order of the if else statements matter!
            } else {
                if (r == m - 1) { //Perform the opposite when moving downwards
                    dir = 1;
                    c++;
                } else if (c == 0) {
                    dir = 1;
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        //Return the diagonally flattened matrix in an array of 1D 
        return result;
    }
}