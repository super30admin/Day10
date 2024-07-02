/*
Time Complexity: 2 * O(n)

Space Complexity: O(1) 
*/

#include<iostream>
#include<vector>


class Solution {
public:
    std::vector<int> productExceptSelf(std::vector<int>& nums) {
        std::vector<int> result;
        long runningProduct = 1;
        result.push_back(runningProduct);
        for(int i=1; i<nums.size(); i++){
            runningProduct *= nums[i-1];
            result.push_back(runningProduct);
        }
        runningProduct = 1;
        for(int j=nums.size()-2 ; j>=0; j--){
            runningProduct *= nums[j+1];
            result[j] = runningProduct*result[j];
        }
        return result;
    }
};

int main(){
    Solution sol = Solution();
    std::vector<int> arr {1,2,3,4};
    std::vector<int> vexp_res = {24,12,8,6};
    std::vector<int> vres = sol.productExceptSelf(arr);
    for(int i= 0; i<vexp_res.size(); i++){ 
        int res = vres[i];
        int exp_res = vexp_res[i];
        if (res == exp_res){
            std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
        } else {
            std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
        }
    }

    arr = {-1,1,0,-3,3};
    vexp_res = {0,0,9,0,0};
    vres = sol.productExceptSelf(arr);
    for(int i= 0; i<vexp_res.size(); i++){ 
        int res = vres[i];
        int exp_res = vexp_res[i];
        if (res == exp_res){
            std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
        } else {
            std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
        }
    }
}