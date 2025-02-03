// https://leetcode.com/problems/diagonal-traverse/
// Time Complexity : O(n*m) where n is the number of rows and m is the number of columns
// Space Complexity : O(n*m) where n is the number of rows and m is the number of columns
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Use a haspmap to store the value of mat[i][j] as map[i+j] for each i,j
// Now the hashmap contains element at each diagonal but in top-right to bottom-left order.
// Reverse the order for even indecies and add it to the ans vector.

// Your code here along with comments explaining your approach

class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int> ans;
        map<int, vector<int>> mp;
        int rows = mat.size();
        int cols = mat[0].size();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols;j++){
                mp[i+j].push_back(mat[i][j]);
            }
        }
        for(auto i:mp){
            if(i.first%2 == 0){
                for(int j=i.second.size()-1; j>=0; j--){
                    ans.push_back(i.second[j]);
                }
            }
            else{
                for(int j=0; j<i.second.size(); j++){
                    ans.push_back(i.second[j]);
                }
            }
        }
        return ans;

    }
};