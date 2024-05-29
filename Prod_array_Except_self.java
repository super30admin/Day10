// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Logic is to multiply left running product with right running product without that element.
// Calculate Running Product of left elements, then multiply same array from right side by using running 
// product from right side

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length ==0){
            return null;
        }
        int rProd = 1;
        int [] answer = new int[nums.length];
        answer[0] = rProd;
        for (int i=1; i<nums.length; i++){
            rProd *= nums[i-1]; 
            answer[i] = rProd;
            
        }
        rProd = 1;
        for (int i = nums.length-2 ; i>=0; i--){
            rProd *= nums[i+1]; 
            answer[i] = answer[i] * rProd;
            
        }
        return answer;
    }
}