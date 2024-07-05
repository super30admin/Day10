// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// right product and left product and then multiple both gives product except self.

// Your code here along with comments explaining your approach
class Solution {
    /*
    [1,2,3,4]
    [1,1,2,6] p = 12
       12  8  1
    p = 1
    [      6]
    */
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i = 1;i<nums.length;i++){
            product =  product*nums[i-1];
            left[i] = product;
        }
        product = 1;
        for(int i = nums.length-2;i>=0;i--){
            product = product * nums[i+1];
            left[i] = left[i] * product;
        }
        return left;

    }
}
