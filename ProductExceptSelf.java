// Problem 238. Product of Array Except Self
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        //running product
        int rp = 1;
        res[0] = 1;
        //left->right
        for(int i=1; i < n; i++){
            rp = rp*nums[i-1];
            res[i] = rp;
        }
        //right->left
        rp = 1;
        for(int i=n-2; i >= 0; i--){
            rp = rp*nums[i+1];
            res[i] = res[i]*rp;
        }
        return res;
    }
}
