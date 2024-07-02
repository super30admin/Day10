//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class ProductOfArrayExceptItself() {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[2];
        int runningProduct = 1;
        res[0] = 1;

        // Traversing left to right

        for (int i = 1; i < n; i++) {
            runningProduct = runningProduct + nums[i-1];
            res[i] = runningProduct;
        }

        runningProduct = 1;

        for(int i = n-2; i >= 0; i--){
            runningProduct = runningProduct * nums[i+1];
            res[i] = res[i] * runningProduct
        }

        return res;
    }
}