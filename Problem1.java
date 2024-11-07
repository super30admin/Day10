// Time Complexity : O(3N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Get running product from left and right excluding the number and multiply both in the result array

// Your code here along with comments explaining your approach
//https://leetcode.com/problems/product-of-array-except-self/description/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int[] left = new int[nums.length];

        //int prd = 1;
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }

        result[nums.length-1] =  1;
        for(int j=nums.length-2;j>=0;j--){
            result[j] = result[j+1]*nums[j+1];
        }

        for(int k=0;k<nums.length;k++){
            result[k] = left[k]*result[k];
        }
        return result;
    }
}