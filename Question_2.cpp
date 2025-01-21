#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
    vector<int>ans;
    bool up = true;
    int m = mat.size(), n = mat[0].size();
    pair<int,int>top_ind = {0,0}, bottom_ind = {0,0};
    while(top_ind.first<m-1||top_ind.second<n-1){
        if(up){
            pair<int,int>ptr = bottom_ind;
            while(ptr.first>=top_ind.first){
                ans.push_back(mat[ptr.first][ptr.second]);
                ptr.first--;
                ptr.second++;
            }
        }
        else{
            pair<int,int>ptr = top_ind;
            while(ptr.first<=bottom_ind.first){
                ans.push_back(mat[ptr.first][ptr.second]);
                ptr.first++;
                ptr.second--;
            }
        }
        up = !up;
        if(top_ind.second<n-1) top_ind.second++;
        else top_ind.first++;
        if(bottom_ind.first<m-1) bottom_ind.first++;
        else bottom_ind.second++;
    }
    ans.push_back(mat[m-1][n-1]);
    return ans;
}

int main(){
    vector<vector<int>> mat = {{1,2,3},{4,5,6},{7,8,9}};
    vector<int> ans = findDiagonalOrder(mat);
    for(auto x:ans) cout<<x<<" ";
    return 0;
}