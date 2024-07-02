/*
 * TC : O(n)
 * SC : O(1) 
 * Did this code successfully run on Leetcode :yes
 
 Approach:
 take running multiplcation of prefix and store in result array
 take running multiplication of suffic and add in the result array
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i=1 ;i<nums.length ;i++) {
            result[i] = nums[i-1] * result[i-1];
        }
        int temp = nums[nums.length - 1];
        for(int i=nums.length-2 ;i>=0 ;i--) {
            result[i] = temp * result[i];
            temp = nums[i] * temp;
        }
        return result;
    }
}