// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; //Calculate the length of the array
        int rp = 1; //Calculate the running product
        int [] result = new int[n]; //Create a matrix
        result[0] = rp;
        for(int i = 1; i <= n - 1; i++){
            rp = rp * nums[i - 1]; //Multiply the previous elem with the running product
            result[i] = rp; //Store the running product in the result array for the left side of the array
        }

        rp = 1;
        for(int i = n - 2; i >= 0; i--){
            rp = rp * nums[i + 1]; //Multiply the next elem with the running product
            result[i] = rp * result[i]; //Store the running product in the result array for the right side of the array
        }
        return result;
    }
}