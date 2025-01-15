// Time Complexity : O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*learning: taking care of top-left boundary first and bottom -left boundary*/
// Your code here along with comments explaining your approach

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();

        vector<int> ans;
        ans.resize(m*n);  //total numbetr of elements
        
        int row=0, col =0; //starting from 0,0
        int index =0; //for 1-d array to fill up.
        
        int dir =1; // direction is bottom to top
        while(index<m*n){
            ans[index] = mat[row][col];
            index++;
            if(dir ==1){
//Right boundary check before, it is hitting both top and right boundary.This will cover both right and top boundary case. (at 3, also cases like 9)              
                if(col==n-1){ 
                    dir =-1;
                    row++;
                }
//this is not placed first in condition (if at top -right boundary, cannot do increase col)                
                else if(row ==0){
                    dir =-1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
//this is covering both left boundary and bottom boundary.
                if(row ==m-1){ 
                    dir =1;
                    col++;
                }
//if this written before. It will not help with bottom case first.
                else if(col==0){
                    dir =1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
};