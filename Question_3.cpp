#include <iostream>
#include <vector>
using namespace std;

void spiralPush(vector<vector<int>>& matrix, vector<int>&ans,int r_i,int r_j, int c_i,int c_j){
    for(int i=c_i;i<=c_j;i++) ans.push_back(matrix[r_i][i]);
    for(int i=r_i+1;i<=r_j;i++) ans.push_back(matrix[i][c_j]);
    for(int i=c_j-1;i>=c_i&&r_j!=r_i;i--) ans.push_back(matrix[r_j][i]);
    for(int i=r_j-1;i>=r_i+1&&c_i!=c_j;i--) ans.push_back(matrix[i][c_i]);
}
vector<int> spiralOrder(vector<vector<int>>& matrix) {
    int m = matrix.size(), n = matrix[0].size();
    int r_i = 0, r_j = m-1, c_i = 0, c_j = n-1;
    vector<int>ans;
    while(r_i<=r_j&&c_i<=c_j){
        spiralPush(matrix,ans,r_i,r_j,c_i,c_j);
        r_i++;
        r_j--;
        c_i++;
        c_j--;
    }
    return ans;
}

int main(){
    vector<vector<int>> matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    vector<int> ans = spiralOrder(matrix);
    for(auto x:ans) cout<<x<<" ";
    return 0;
}