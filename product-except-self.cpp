// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
/*Compute left product array and multiply every element with running right product.*/
// Your code here along with comments explaining your approach
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n= nums.size();
        vector<int> leftProduct;  //creating leftProduct array
        leftProduct.resize(n);
        int rp=1;
        leftProduct[0] = rp; //no element on left so product is 1
        for(int i=1; i<n; i++){ // populating with products on left
            rp= rp* nums[i-1];
            leftProduct[i] = rp;
        }
        rp =1; //setting rp to 1 to reuse same variable
        leftProduct[n-1]= leftProduct[n-1]* rp;
        for(int i=n-2; i>=0; i--){ //at every leftProduct multiplying product on right
            rp= rp* nums[i+1];
            leftProduct[i]= leftProduct[i]*rp;
        }
        return leftProduct;
    }
};