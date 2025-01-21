#include <bits/stdc++.h>
#include <vector>
#include <iostream>
using namespace std;

vector<int> productExceptSelf(vector<int>& nums) {
    int n = nums.size();
    vector<int>ans(n,1);
    int leftRunningProduct = 1,rightRunningProduct=1;
    for(int i=0;i<=n-1;i++){
        ans[i]*=leftRunningProduct;
        leftRunningProduct*=nums[i];
    }
    for(int i=n-1;i>=0;i--){
        ans[i]*=rightRunningProduct;
        rightRunningProduct*=nums[i];
    }
    return ans;
}

int main(){
    vector<int> nums = {1,2,3,4};
    vector<int> ans = productExceptSelf(nums);
    for(auto x:ans) cout<<x<<" ";
    return 0;
}