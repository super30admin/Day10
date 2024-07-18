/*
    1. Time Complexity : O(n)
    2. Space Complexity : O(1)  
    3. Did this code successfully run on Leetcode : Yes
    4. Any problem you faced while coding this : -
 */

class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
            ans[i] = ans[i-1] * nums[i-1];
        }
        int rProd = 1;
        for (int i = nums.length - 1; i >=0; --i) {
            ans[i] = ans[i] * rProd;
            rProd *= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,1,9,-3,3, 12, 27 ,23,18};
        int[] res = productExceptSelf(nums);
        System.out.println("Product of Array Except Self:");
        for (int n: res)
            System.out.print(n+" ");
    }
}