// TC = O(n)
// SC = O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // maintain running product till that index from L & R and then multiply it at index. eg. result[i] = left[i] * right[i]
        int n = nums.length;
        int[] result = new int[n];
        // null
        if(nums == null || n == 0) return result;
        int pass = 1;
        result[0] = 1; // initialize result[0] with 1
        // left pass
        for(int i = 1; i < n; i++) { 
            pass *= nums[i - 1];
            result[i] = pass;
        }
        // right pass
        pass = 1; // reset pass
        for(int i = n - 2; i >= 0; i--) {
            pass *= nums[i + 1];
            result[i] *= pass; // IMP multiply result with pass to get left and right product
        }
        return result;
    }
}