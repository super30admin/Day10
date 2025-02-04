// https://leetcode.com/problems/product-of-array-except-self/description/
// Time Complexity : O(n) where n is the number of elements in the array
// Space Complexity : Auxillary Space: O(1) as we are using only one array to store the result
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: Using result array to store the product of elements to the left of the current element. Then using a variable to store the product of elements to the right of the current element. Finally, multiplying the left and right products to get the result.
class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return nums;
        }

        int rp = 1;
        int n = nums.length;
        int[] result = new int[n];
        // int[] right = new int[n];
        // int[] res = new int[n];

        result[0] = rp;
        //right[n-1] = rp;

        for(int i = 1; i < n; i++){
            result[i] = result[i-1]*nums[i-1];
        }

        // for(int i = n-2; i >= 0; i--){
        //     right[i] = nums[i+1]*right[i+1];
        // }
        int R = 1;
        for(int i = n-1; i >= 0; i--){
            result[i] = result[i]*R;
            R *= nums[i];
        }

        return result;

    }
}
