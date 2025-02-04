/*The code traverses the matrix diagonally, starting from the top-left corner and moving in an upward or downward direction alternatively.
It uses a boolean variable dir to determine the direction of movement. When dir is true, it moves upward, and when dir is false, it moves downward.
The result vector is filled with the elements in diagonal order, and the indices (r, c) are updated based on the current direction.
Time Complexity:
The code visits each element of the matrix exactly once, so the time complexity is O(m * n), where m and n are the dimensions of the matrix.
The space complexity is O(m * n) as the result vector stores all the elements in diagonal order.*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m=mat.size();
        int n=mat[0].size();
        vector<int> result(m * n);
        int r=0,c=0;
        bool dir=true;
        for(int i=0;i<m*n;i++){
            result[i]=mat[r][c];
            if(dir){
                if(r==0&&c!=n-1){
                    c++;
                    dir=false;
                }else if(c==n-1){
                    r++;
                    dir=false;
                }else{
                    r--;c++;
                }
            }else{
                if(c==0&&r!=m-1){
                    r++;
                    dir=true;
                }else if(r==m-1){
                    c++;
                    dir=true;
                }else{
                    r++;c--;
                }
            }
        }
        return result;
    }
};