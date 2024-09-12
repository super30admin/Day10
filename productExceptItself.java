// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: Calculate running product for each element while doing the left pass and store in corresponding index in the result[]. Then do the same for right pass but multiply already existing value in result[] with current running product and update the value.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length < 2) return new int[0];
        int[] result = new int[nums.length];
        //left pass
        int rp = 1;
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rp *= nums[i-1];
            result[i] = rp;
        } 
        rp = 1;
        for (int i = nums.length - 2; i >= 0; i--){
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}

