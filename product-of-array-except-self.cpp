/*The algorithm initializes a result vector with the same size as the input nums vector, where each element is initially set to 1.
It then traverses the nums vector twice, updating the result vector to store the product of all elements to the left and right of each element, excluding the element itself.
The final result vector contains the product of all elements except the one at the current index. 
The time complexity is O(n) as we traverse the array twice, and the space complexity is O(1) excluding the result vector.*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
      vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int> result(n, 1);
        int r=1;
        for(int i=1;i<n;i++){
            r =r*nums[i-1];
            result[i]=r;
        }
        r=1;
        for(int i=n-2;i>=0;i--){
            r =r*nums[i+1];
            result[i]*=r;
        }
        return result;
    }
};