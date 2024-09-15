// Time Complexity : O(n * m)  ... n = row in matrix; m = columns in matrix           
// Space Complexity : O(n * m) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/diagonal-traverse/

Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
*/

/*
Explanation : 
Boolean variable is used to track UP or DOWN direction of traversal.
Corner cases/matric edge cases are handled first and then normal scenarion is handled.

In normal UP traverse, i reduces by 1 and j increases by 1.
While handling corner cases, extreme corner is handled first i.e. when i = 0 and j = last column
and then other corner cases are handled i.e. when i = 0. Whenever we hit the corner case
direction is changed.
*/

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {

        bool direction = 1; // 1 for UP and 0 for DOWN direction
        int size = mat.size()*mat[0].size();
        int i = 0, j = 0;
        vector<int>result;

        for(int idx = 0; idx < size; idx++){
            result.push_back(mat[i][j]);
            if(direction){
                if (j == mat[0].size()-1) {
                    i++;
                    direction = false;
                } else if(i == 0){
                    j++;
                    direction = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == mat.size()-1){
                    j++;
                    direction = true;
                } else if(j == 0){
                    i++;
                    direction = true;
                } else {
                    i++;
                    j--;
                }
            }
        }

        return result;
        
    }
};