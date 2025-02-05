// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        bool goingUp = true;
        int m = mat.size();
        int n = mat[0].size();
        vector<int>ans;

        int i = 0;
        int j = 0;
        // int idx = 0;
        while (ans.size() < m*n) {
            ans.push_back(mat[i][j]);
            // idx+?+;
            if (goingUp){
                if(j == n-1){
                    i++;
                    goingUp = false;
                }
                else if (i==0){
                    j++;
                    goingUp = false;
                }

                else {
                    i--; j++;
                }
            }
            else {
                if(i == m-1){
                    j++;
                    goingUp = true;
                }
                else if (j==0){
                    i++;
                    goingUp = true;
                }
                 
                else{
                    i++; j--;
                }
            }
        }
        return ans;
    }
};