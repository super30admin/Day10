/*
 * Time complexity : O(N)
 * Space complexity : O(N) 
 */
#include<iostream>
#include<vector>

using namespace std;

vector<int> productExceptSelf(vector<int>& nums) {
    
    int n = nums.size();
    vector<int> result(n, 1);

    int rp = 1;
    result[0] = rp;

    for(int i = 1; i < n; i++) {
        rp = rp * nums[i-1];
        result[i] = rp;
    }
    // Left products in array
    rp = 1;
    // Right to Left
    for(int  i =n-2; i >= 0; i--) {
        rp = rp * nums[i+1];
        result[i] = rp *result[i];
    }

    return result;

}
int main() {
    
    vector<int> nums;

    nums.push_back(1);
    nums.push_back(2);
    nums.push_back(3);
    nums.push_back(4);

    int n = nums.size();
    vector<int> result(n, 1);

    result = productExceptSelf(nums);

    for(int i = 0; i < result.size(); i++) {
        cout << result[i] << " ";
    }
}