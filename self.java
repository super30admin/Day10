// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: For this solution, we calculate the left product. This is done by creating a new array
// updating each value with the running product of all the elements with left of it. If we are at index 4 then we will have computed it with
// all the 4 number's product. After this, we run another loop to calculate the final array. This is done in the same way but we take the 
// right product and iteratively multiply with the running product as well.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length ==0){
            return new int[] {};
        }
        int n = nums.length;
        int[] result = new int[n]; // creating new array, still O(1)
        int rp = 1;
        result[0] = rp;
        // starting with left product
        for(int i = 1; i < nums.length; i++){
            rp =  rp * nums[i - 1]; // calculating with iterated numbers left of current index and storing it in rp
            result[i] = rp;
        }
        // calculating the result
        rp = 1;
        for(int i = n - 2; i >= 0; i--){
            rp = rp * nums[i+1]; // calculating with iterated numbers right of current index and storing it in rp
            result[i] = rp * result[i];
        }
        return result; 
    }
}