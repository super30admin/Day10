// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * Initialize arrays answer and R to store results and right-side products respectively.
 *  Compute left-side products in answer array. Compute right-side products in R array.
 *  Combine left and right products to compute final result array answer.
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] R = new int[nums.length];
        answer[0]=1;
        for(int i=1; i<nums.length; i++)
        {
            answer[i] = answer[i-1] * nums[i-1];
        }
        
        R[nums.length-1]=1;
        
        for(int i=nums.length-2; i>=0; i--)
        {
            R[i] = R[i+1] * nums[i+1];
        }
        
        for( int i=0; i<nums.length; i++)
        {
            answer[i] = answer[i] * R[i];
        }
        
        return answer;
    }
}