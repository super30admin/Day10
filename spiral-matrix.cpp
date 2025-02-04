/*The algorithm performs a spiral traversal of the matrix by maintaining four pointers (r1, r2, c1, c2) representing the boundaries of the current layer. It iterates over the layers in a clockwise direction.
The loop traverses the top, right, bottom, and left sides of the current layer, adding the elements to the ans vector. It adjusts the pointers accordingly after each side is processed.

The time complexity is O(m * n) since every element in the matrix is visited once. 
The space complexity is O(1) as the ans vector is used to store the result without using additional space proportional to the input size.*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int>ans;
        int m = matrix.size();
        int n = matrix[0].size();
        int r1=0, r2=m-1, c1=0, c2=n-1, val=1;
        while(c1<=c2 && r1<=r2){
            for(int i=c1; i<=c2; i++){
                ans.push_back(matrix[r1][i]);
            }
            r1++;
            for(int i=r1; i<=r2; i++){
                 ans.push_back(matrix[i][c2]);
            }
            c2--;
            if(c1<=c2&&r1<=r2){
            for(int i=c2; i>=c1; i--){
                  ans.push_back(matrix[r2][i]);
            }
            r2--;
            for(int i=r2; i>=r1; i--){
                  ans.push_back(matrix[i][c1]);
            }
            c1++;
            }
        }
        return ans;
    }
};