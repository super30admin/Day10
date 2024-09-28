// Time Complexity : O(n) asymptotically
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/product-of-array-except-self/submissions/1048892598/
// Three line explanation of solution in plain english
/*
 * For every element in the array, maintain the left product and right product
 * Multiply both the left and right products and return the result
 */

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length == 0)
            return new int[]{};
        int prod=1; 
        int rev_prod =1;
        int n= nums.length;
        int left[] = new int[nums.length];
        left[0]=1;
        int right[] = new int[nums.length];
        right[n-1]=1;
        int result[] = new int[nums.length];
        for(int i=1;i< nums.length;i++ ){
            prod *= nums[i-1];
            left[i]=prod;
        }
        for(int i=n-2; i>=0 ;i--){
            rev_prod *= nums[i+1];
            right[i]=rev_prod;
        }
        for(int i=0 ; i<nums.length ;i++){
            result[i] = left[i]*right[i];
        }
        return result;
    }
}