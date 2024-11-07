//238. Product of Array Except Self - https://leetcode.com/problems/product-of-array-except-self/
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //base case
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        //logic
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1; int temp = 1;
        //left pass
        for(int i=0; i<n; i++){
            rp = rp * temp;
            result[i] = rp;
            temp = nums[i];
        }
        rp = 1; temp = 1;
        //right pass
        for(int i=n-1; i>=0; i--){
            rp = rp * temp;
            result[i] = result[i] * rp;
            temp = nums[i];
        }
        return result;
    }
}