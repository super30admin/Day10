
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//  to calculate the product at index i, we need the product of Left Sub array till (0 to i-1) and product of right sub array  (i+1 to n)
class ProductSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0]=1;
        for(int i=1;i<n;i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        int rp =1;
        for(int i=n-1; i>=0;i--) {
            result[i] = result[i] *rp;
            rp = rp * nums[i];
        }

        return result;
    }
}